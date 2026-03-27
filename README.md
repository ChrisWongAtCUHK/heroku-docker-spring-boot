# Docker 
## Build
```
docker build -t heroku-docker-spring-boot-app .
```
## Run
```
docker run -p 8080:8080 heroku-docker-spring-boot-app
```
or
```
docker run -d -p 8080:8080 heroku-docker-spring-boot-app
```
