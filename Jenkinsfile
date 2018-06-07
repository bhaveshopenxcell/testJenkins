node{
    stage('Gradle Build'){
        echo "Build Started"
        sh "docker run --name java -v /home/ubuntu/artifacts:/build gradle"
        sh "./gradlew :clean"
        sh "./gradlew :assemble"
        echo "Build Done"
    }
}
