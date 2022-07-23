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
  }
}
