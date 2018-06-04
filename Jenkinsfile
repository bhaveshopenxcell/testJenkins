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
                sh 'sleep 99999999999'
            }
        }
    }
}
