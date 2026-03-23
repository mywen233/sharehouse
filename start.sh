#!/bin/bash
set -e

# Start MariaDB
echo "Starting MariaDB..."
service mariadb start || service mysql start

# Wait for DB to be responsive
sleep 3

# Start Memcached
echo "Starting Memcached..."
memcached -d -u root -m 64 -p 11211

# Start Tomcat in foreground
echo "Starting Tomcat..."
catalina.sh run
