node{
    stage('Gradle Build'){
        echo "Build Started"
        sh "docker run --name java gradle"
        sh "./gradlew :clean"
        sh "./gradlew :assemble"
        echo "Build Done"
    }
}
