pipeline{
    agent any    
    stages{    
              
        stage('Verify Branch'){
            steps{
               echo "$GIT_BRANCH" 
            }
        }
        
        stage ('Build') {
            steps {
               bat "mvn -version"
               bat "mvn clean install"
            }
        }
        stage ('Deploy') {
            steps {
               bat '''copy C:\\Users\\dell\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\spring-boot-github\\target\\*.war F:\\apacheTomcat\\webapps\\'''
            }
        }
    }
    post {
        always {
            cleanWs();
        }
    }
        
}
