FROM openjdk:21-jdk-oracle
WORKDIR ./
COPY ../../../src/test/ ./
ENTRYPOINT ["sh", "-c", "javac test.java && java test"]