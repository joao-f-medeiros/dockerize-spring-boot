FROM centos

RUN yum install -y java

VOLUME /tmp
ADD /target/dockerize-spring-boot-0.0.1-SNAPSHOT.jar dockerize-spring-boot.jar
RUN sh -c 'touch /dockerize-spring-boot.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerize-spring-boot.jar"]