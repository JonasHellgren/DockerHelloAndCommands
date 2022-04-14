#base image
FROM openjdk:14

ADD out/artifacts/DockerTutorials_jar/DockerTutorials.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","docker-spring-boot.jar"]