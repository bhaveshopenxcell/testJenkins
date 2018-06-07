node {
        docker {
            image 'gradle'
        }
    
       def app
    
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
                app = docker.build "javagradlebuilded"
            }
        }
    
}
