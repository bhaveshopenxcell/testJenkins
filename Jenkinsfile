pipeline{
    agent none
    stages{
        stage('Clean & Assemble'){
            agent{
                docker{
                    image 'gradle:latest'
                }
            }
            steps{
                sh "gradle clean"
                sh "gradle assemble"
            }
        }
        stage('Deploy'){
            agent{
                docker{
                    image 'openjdk:latest'
                    args '--detach -p 8082:8082'
                }
            }
            steps{
                sh "java -jar build/libs/jetkinstest-0.0.1-SNAPSHOT.jar"
                echo "Rest APIs published successfully!!!!!!!"
            }
        }
    }
}