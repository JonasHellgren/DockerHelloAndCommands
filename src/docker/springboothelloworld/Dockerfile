#base image
FROM openjdk:14

#copy from host to image
COPY src/ /src/

#compile code in image
RUN javac /src/main/java/springboothelloworld/SpringApplication.java -d /app

#folder for future commands
WORKDIR /app

EXPOSE 8085

#run main class
CMD ["java", "springboothelloworld.SpringApplication"]

