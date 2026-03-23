#!/bin/bash
set -e

# Start MariaDB
echo "Starting MariaDB..."
service mariadb start || service mysql start

# Wait for DB to be responsive
echo "Waiting for MySQL to boot fully..."
for i in {1..15}; do
    if mysqladmin ping -h"127.0.0.1" --silent; then
        echo "MySQL is up and ready!"
        break
    fi
    sleep 2
done

# Initialize unmapped legacy tables
echo "Initializing legacy unmapped tables..."
mysql sharehouse < /app/schema_extras.sql || echo "Warning: failed to load schema_extras.sql"

# Start Memcached
echo "Starting Memcached..."
memcached -d -u root -m 64 -p 11211

# Start Tomcat in foreground
echo "Starting Tomcat..."
catalina.sh run
