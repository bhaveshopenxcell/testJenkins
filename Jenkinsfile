node{
    stage('Gradle Build'){
        steps{
            echo "Build Started"
            sh 'sudo docker ps -a'
            sh "apt-get install"
            sh "apt-get update"
            sh "apt-get install gradle"
            sh "gradle :clean"
            sh "gradle :assemble"
            echo "Build Done"
        }
    }
}
