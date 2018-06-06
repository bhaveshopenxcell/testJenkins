node{
    stage('Gradle Build'){
        echo "Build Started"
        /*
        Note: We have already created the running image of Gradle with name "JAVA" and 
        hence we only need to restart the container in order to do the build process.
        */
        sh "docker restart java"
        sh "./gradlew :clean"
        sh "./gradlew :assemble"
        sleep "9999999999999"
        /*echo "Build Done"*/
    }
}
