node{
    stage('Gradle Build'){
        echo "Build Started"
        sh 'docker ps -a'
        sh "apt-get install"
        sh "apt-get update"
        sh "./gradlew :clean"
        sh "./gradlew :assemble"
        echo "Build Done"
    }
}