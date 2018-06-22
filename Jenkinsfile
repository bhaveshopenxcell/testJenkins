pipeline{
    agent any
    stages{
        stage('Clean'){
            steps{
                sh "./gradlew clean"
            }
        }
        stage('Assemble'){
            steps{
                sh "./gradlew assemble"
            }
        }
        stage('Deploy'){
            steps{
                sh "docker cp myjenkins:/var/jenkins_home/workspace/testjenkins_master-3UTD27TGRUAIYICLCYVIYFJGXLQDR4FZZ6XGSC7RSOOSKIHALDQA/build/libs/jetkinstest-0.0.1-SNAPSHOT.jar /home/bhavesh/target/app.jar"
                echo "Done"
            }
        }
    }
}