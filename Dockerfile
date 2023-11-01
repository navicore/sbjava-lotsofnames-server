FROM eclipse-temurin:17.0.9_9-jre

MAINTAINER Ed Sweeney <ed@onextent.com>

EXPOSE 8080
EXPOSE 8081

RUN mkdir -p /app

COPY build/libs/*SNAP*.jar /app/app.jar

WORKDIR /app

# override CMD from your run command, or k8s yaml, or marathon json, etc...
CMD java -Dlog4j2.formatMsgNoLookups=true -jar ./app.jar

