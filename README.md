# Misy - Spring Cloud test project
Can be runned with or without docker containers
## Services
* Discovery Server - http://localhost:8761
* Config Server - http://localhost:8888
* API Gateway - http://localhost:8080
* Departments Services - random port

## Local

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