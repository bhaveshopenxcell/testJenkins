pipeline {
    agent {
        docker {
            image 'gradle'
        }
    }
    stages {
        stage('build') {
           steps {
                sh './gradlew :clean'
                sh './gradlew :assemble'
               echo 'Completed'
                sh 'sleep 10'
            }
        }
        stage('docker image') {
           steps {
                def app = docker.build "javagradlebuilded"
            }
        }
    }
}
