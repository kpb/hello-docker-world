FROM debian:jessie

RUN echo "deb http://ftp.debian.org/debian jessie-backports main" >>/etc/apt/sources.list && \
    apt-get update && \
    apt-get install -y --force-yes --no-install-recommends openjdk-8-jdk

COPY build/libs/hello-docker-world-1.0.0.jar /opt

ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/hello-docker-world-1.0.0.jar"]
