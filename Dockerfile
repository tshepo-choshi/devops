FROM openjdk:17
WORKDIR /app-container
COPY ./target/jenkinsCiCd.jar /app-container
EXPOSE 8282
CMD ["java","-jar","jenkinsCiCd.jar"]