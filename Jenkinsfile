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
               bat '"copy C:\\Users\\dell\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\spring-boot-github\\target\\jenkins-1\\*.war F:\\Personal(Dont Delete)\\Softwares\\Java\\apache-tomcat-9.0.53\\webapps"'
            }
        }
    }
    post {
        always {
            cleanWs();
        }
    }
        
}
