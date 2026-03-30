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

## [站在 Docker 的肩膀上，部署任何語言的 Web 應用到 Heroku](https://medium.com/starbugs/deploy-any-web-application-to-heroku-with-docker-b64b9b0eb93)

Build docker image
```
docker build -t heroku-docker-spring-boot-app .
```

在 Heroku 上新增一個 app
```
heroku create heroku-docker-spring-boot-app
heroku git:remote --app heroku-docker-spring-boot-app
```

部署到 Heroku
```
heroku container:login
heroku stack:set container
heroku container:push web
heroku container:release web
```
```
heroku open
```

# [Testing JSON in Spring Boot](https://mkyong.com/spring-boot/testing-json-in-spring-boot/)
- [Testing JSON Simple Structure](https://mkyong.com/spring-boot/testing-json-in-spring-boot/#testing-json-simple-structure)