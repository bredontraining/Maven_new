pipeline {
  agent any
  stages{
    stage('Git clone') {
      echo "Cloning the repo......"
    }
    stage('package'){
      echo "creating package ....."
    }
    stage('Deploy'){
      echo "Deploying......"
    }
  }
}

  
    
