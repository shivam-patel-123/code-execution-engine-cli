FROM node:18-alpine3.16
WORKDIR /usr/app
ARG CODE_FILE_NAME=error.js
ENV CODE_FILE_NAME ${CODE_FILE_NAME:-error.js}
COPY ./codefiles/${CODE_FILE_NAME} ./
ENTRYPOINT [ "sh", "-c", "node ${CODE_FILE_NAME}" ]