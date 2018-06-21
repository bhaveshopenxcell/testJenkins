node{
    stage('Gradle Build'){
        echo "Build Started"
        sh "apt-get install"
        sh "apt-get update"
        sh "apt-get install gradle"
        sh "gradle :clean"
        sh "gradle :assemble"
        echo "Build Done"
    }
}
