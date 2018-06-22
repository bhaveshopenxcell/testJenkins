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
                echo "Deployment is Pending"
            }
        }
    }
}