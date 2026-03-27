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
## Build and run container with `docker-compose.yml`
```
docker compose up --build
```