node{
    stage('Gradle Build'){
        echo "Build Started"
        sh "sudo apt-get install"
        sh "sudo apt-get update"
        sh "sudo apt-get install gradle"
        sh "gradle :clean"
        sh "gradle :assemble"
        echo "Build Done"
    }
}
