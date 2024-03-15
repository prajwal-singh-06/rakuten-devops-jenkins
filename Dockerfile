FROM openjdk:17

ADD /target/docker-jenkins-devops.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]

EXPOSE 7070