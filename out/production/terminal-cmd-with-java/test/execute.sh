#! /bin/bash
IMAGE_NAME="code-compiler-java"
IMAGE_ID=$(docker build -t ${IMAGE_NAME} -q .)
docker run --rm "${IMAGE_ID}"
