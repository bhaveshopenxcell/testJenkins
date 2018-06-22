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
            agent none
            steps{
                sh "docker cp myjenkins:/var/jenkins_home/workspace/testjenkins_master-3UTD27TGRUAIYICLCYVIYFJGXLQDR4FZZ6XGSC7RSOOSKIHALDQA/build/libs/jetkinstest-0.0.1-SNAPSHOT.jar /home/app.jar"
                echo "Done"
            }
        }
    }
}