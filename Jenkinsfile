node{
    stage('Gradle Build'){
        echo "Build Started"
        /*
        Note: We have already created the running image of Gradle with name "JAVA" and 
        hence we only need to restart the container in order to do the build process. Doing good
        */
        
       /* sh "docker restart java" */
        echo "Gold"
        sh "./gradlew :clean"
        sh  "docker ps"
        sh "./gradlew :assemble"
        // Ku6 problem he?"
        /*sleep "9999999999999"
        echo "Build Done"*/
    }
}
