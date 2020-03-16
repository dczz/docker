FROM openjdk:8
ADD target/*.jar /docker.jar
CMD ["java","-jar","docker.jar"]