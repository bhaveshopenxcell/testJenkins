#!/usr/bin/env bash
docker run  --name gradlespring -v gradle-vol:/home/gradle/project -w /home/gradle/project gradle /bin/bash
#docker run --name gradlespring -v "$PWD"/build/libs:/home/gradle/project -w /home/gradle/project gradle java -jar jetkinstest-0.0.1-SNAPSHOT.jar