pipeline {
 agent any
     
  stages {
    stage('First') {
       steps {
           script {
                sh ''' echo "First stage" '''
      
            }    
       }
    }
    stage('Second') {
       steps {
         script {
                 sh '''echo "Second stage" '''
         }
       }  
    }
    stage('SonarQube analysis') {
      steps {
          withSonarQubeEnv(credentialsId: '0d63c08de4c2b8281d00ae79f51c5b3e236d983c', installationName: 'sonarqube') { // You can override the credential to be used
          sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
          }
    }
  }
  }
}
