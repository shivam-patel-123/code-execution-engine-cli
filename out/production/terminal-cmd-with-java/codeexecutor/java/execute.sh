#! /bin/bash
START=$(date +%s.%6N)
IMAGE_NAME="code-compiler-java"
IMAGE_ID=$(docker build --build-arg CODE_FILE_NAME="$1" -t ${IMAGE_NAME} -q .)
timeout -s KILL 10 docker run --rm -e CODE_FILE_NAME="$1" "${IMAGE_ID}" > out.txt
exit_status=$?
if [[ $exit_status -ne 0 ]]; then
  rm out.txt
  CONTAINER_ID=$(docker ps -a -q --filter ancestor=${IMAGE_NAME})
  docker stop "${CONTAINER_ID}" > /dev/null 2>&1
  echo "Program took too long to execute. Execution failed."
else
  cat out.txt
  rm out.txt
fi
docker image rm "${IMAGE_ID}" > /dev/null 2>&1
END=$(date +%s.%6N)
runtime=$(echo "$END - $START" | bc)
