FROM java:8
MAINTAINER PartyHulchul
VOLUME /tmp
ADD @project.build.finalName@.jar app.jar
RUN sh -c 'touch /app.jar'
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]