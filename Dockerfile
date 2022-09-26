FROM openjdk:11.0.11-jre

ADD Tuan5_Version1.jar ./app.jar

ENTRYPOINT exec java -jar app.jar