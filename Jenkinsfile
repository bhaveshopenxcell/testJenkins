node {
        docker {
            image 'gradle'
        }
    
       def app
    
        stage('build') {
         
                sh './gradlew :clean'
                sh './gradlew :assemble'
               echo 'Completed'
                sh 'sleep 10'
           
        }
        stage('docker image') {
    
                app = docker.build "javagradlebuilded"
         
        }
    
}
