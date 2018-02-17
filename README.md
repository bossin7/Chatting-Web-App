# Chatting-Web-App for the concurrent and distributed systems examination
1. Clone this repository
```shell
$ git clone https://github.com/bossin7/Chatting-Web-App.git
```
2. Setup the dependencies (Cassandra, Redis, MySQL and RabbitMQ with STOMP support)

```shell
$ docker-compose -f docker-compose/dependencies.yml up -d
```

3. Start the application

```shell
$ wget https://github.com/bossin7/Chatting-Web-App/releases/download/Chatting-web-app-1.0.1/app-1.0.1-SNAPSHOT.jar && java -jar app-1.0.1-SNAPSHOT.jar
```
