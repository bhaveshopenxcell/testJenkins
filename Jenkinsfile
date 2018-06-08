node{
    stage('Gradle Build'){
        echo "Build Started"

        // sh "docker run --name java -v /home/ubuntu/artifacts:/build gradle"

        /*
        Note: We have already created the running image of Gradle with name "JAVA" and 
        hence we only need to restart the container in order to do the build process. Doing good
        */
       /* sh "docker restart java" */
        echo "Gold"
        sh "./gradlew :clean"
        sh  "docker ps"
        sh "./gradlew :assemble"
        echo "Showcasing the demo to Nawaf!!"
        /*sleep "9999999999999"
        echo "Build Done"*/
    }
    /*stages {
        stage('build') {
            steps {
                sh './gradlew :clean'
                sh './gradlew :assemble'
                echo 'Completed'
                sh 'sleep 99999999999'
            }
        }
     }*/
}
