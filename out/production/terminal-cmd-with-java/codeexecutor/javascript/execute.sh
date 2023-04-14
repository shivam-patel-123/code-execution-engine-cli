#! /bin/bash
START=$(date +%s.%2N)
IMAGE_NAME="code-compiler-js"
IMAGE_ID=$(docker build --build-arg CODE_FILE_NAME="$1" -t ${IMAGE_NAME} -q .)
docker run --rm -e CODE_FILE_NAME="$1" "${IMAGE_ID}"
docker image rm "${IMAGE_ID}" > /dev/null 2>&1
END=$(date +%s.%2N)
runtime=$(echo "$END - $START" | bc)