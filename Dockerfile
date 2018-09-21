FROM java:8
EXPOSE 8084
ADD /target/login-elkhorn.jar login-elkhorn.jar
ENTRYPOINT ["java", "-jar","spring-cloud-config.jar"]