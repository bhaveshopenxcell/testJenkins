node{
    stage('Gradle Build'){
        echo "Build Started"
        sh "docker run --name java -v /home/ubuntu/artifacts:/build gradle"
        sh "./gradlew :clean"
        sh "./gradlew :assemble"
        sleep "9999999999999"
        echo "Build Done"
    }
}
