#base image
FROM openjdk:14

#copy from host to image
COPY src/ /src/

#compile code in image
RUN javac /src/main/java/timecounter/TimeCounter.java -d /app

#folder for future commands
WORKDIR /app

#run main class
CMD ["java", "timecounter.TimeCounter"]