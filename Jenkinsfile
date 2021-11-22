pipeline{
    agent any
    tools {
        maven 'MAVEN_HOME'
        jdk 'JAVA_HOME'
    }
    stages{
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${MAVEN_HOME}"
                '''
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
}
