pipeline {
  agent any
  stages{
    stage('Git clone') {
      steps{
      echo "Cloning the repo......"
      }
    }
    stage('package'){
      steps{
      echo "creating package ....."
      }
    }
    stage('Deploy'){
      steps{
      echo "Deploying......"
      }
    }
  }
}

  
    
