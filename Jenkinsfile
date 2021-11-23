pipeline{
    agent any    
    stages{    
              
        stage('Verify Branch'){
            steps{
               echo "$GIT_BRANCH" 
            }
        }
        
        stage ('Initialize') {
            steps {
               bat "mvn -version"
                bat "mvn clean install"
            }
        }
    }
    post {
        always {
            cleanWs();
        }
    }
        
}
