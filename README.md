Spring Boot Demo Server
====================

A simple Spring Boot app I'm using to learn Spring Boot and optimizing a Spring
Boot app for K8S.

![Fun Graphic](docs/rabbit_car.png)

start by creating client and server p12 certs and trust stores by:

Run the server:

```bash
./gradlew bootRun
```

Access the server from a client and not the failure due to mTLS not succeeding
due to an `alert bad certificate` error.

```bash
curl -k http://localhost:8080
```

Get a json response using lotsofname API:

```bash
curl http://localhost:8080/name/Ed
```

Build a deployment in a docker image

```bash
./gradlew bootBuildImage --imageName=navicore/sbjava-lotsofnames-server:0.1.0
```

