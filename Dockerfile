FROM tomcat:9-jdk8

# Disable Tomcat 8005 shutdown port to suppress Render health check log spam
RUN sed -i 's/port="8005" shutdown="SHUTDOWN"/port="-1" shutdown="SHUTDOWN"/' /usr/local/tomcat/conf/server.xml

# Install dependencies (MariaDB, Memcached, Ant)
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
    mariadb-server \
    memcached \
    ant \
    && rm -rf /var/lib/apt/lists/*

# Set up MariaDB with a database and the required user from 2013 configurations
RUN mkdir -p /var/run/mysqld && chown mysql:mysql /var/run/mysqld
RUN service mariadb start && \
    sleep 3 && \
    mysql -e "CREATE DATABASE IF NOT EXISTS sharehouse CHARACTER SET utf8 COLLATE utf8_general_ci;" && \
    mysql -e "CREATE USER 'SHAREHOUSE'@'localhost' IDENTIFIED BY 'O0Z880e63b994Mbf013Sa98R2285D0w2';" && \
    mysql -e "GRANT ALL PRIVILEGES ON sharehouse.* TO 'SHAREHOUSE'@'localhost';" && \
    mysql -e "FLUSH PRIVILEGES;"

# Copy the application source code
WORKDIR /app
COPY . /app

# Build the project using ant
RUN ant

# Move built project to Tomcat's ROOT directory
RUN rm -rf /usr/local/tomcat/webapps/* && \
    mv /app/WebRoot /usr/local/tomcat/webapps/ROOT

# Copy start script
COPY start.sh /start.sh
RUN chmod +x /start.sh

EXPOSE 8080 3306

CMD ["/start.sh"]
