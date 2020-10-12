# Misy - Spring Cloud test project
Can be executed within or without docker containers

## Services
* Discovery Server - http://localhost:8761
* Config Server - http://localhost:8888
* API Gateway - http://localhost:8080
* Departments Services - random port

## Local
### Build
Go to the project's directory: `cd misy`

Build the project: `mvnw.cmd clean install`

### Start
Go to the project's directory: `cd misy`

Af first, run Config Server: `java -jar misy-config-server\target\misy-config-server-0.1.0.jar` 

Then Discovery Server: `java -jar misy-discovery-server\target\misy-discovery-server-0.1.0.jar`

The same way others.

### Stop
Press `Ctrl + c`

## In Docker containers (Linux)

### Build
Go to the project's directory: `cd misy`

Build the project: `./mvnw clean install -PbuildDocker`

### Start
Go to the project's directory: `cd misy`

Start the project: `docker-compose up`
 
### Stop
Press `Ctrl + c`

## Test
Visit http://localhost:8080/api/gateway/departments/1 