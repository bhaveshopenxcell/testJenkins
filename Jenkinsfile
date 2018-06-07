node {
    def GRADLE_HOME = tool name: 'Gradle', type: 'hudson.plugins.gradle.GradleInstallation'

    def app

   

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }

    stage('Gradle build') {
       sh "${GRADLE_HOME}/bin/gradle clean build"
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        app =  docker.build("openxcell/gradleimage")
    }


   
}
