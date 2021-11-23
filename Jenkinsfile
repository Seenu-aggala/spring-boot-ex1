pipeline{
    agent any    
    stages{
        stage ('Initialize') {
            steps {
               sh "mvn -version"
                sh "mvn clean install"
            }
        }
        stage('Hello'){
            steps{
               echo 'Hello World....' 
            }
        }
        
        stage('Verify Branch'){
            steps{
               echo "$GIT_BRANCH" 
            }
        }
    }
    post {
        always {
            cleanWs();
        }
    }
        
}
