FROM openjdk:21-jdk-oracle
WORKDIR ./
ARG CODE_FILE_NAME=test.java
ENV CODE_FILE_NAME ${CODE_FILE_NAME:-test.java}
COPY ./codefiles/${CODE_FILE_NAME} ./
ENTRYPOINT ["sh", "-c", "javac test.java && java ${CODE_FILE_NAME}"]