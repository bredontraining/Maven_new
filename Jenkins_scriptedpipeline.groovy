node {
  stage ('Git clone') {
    echo "Cloning repo ......"
  }
  stage('package') {
    echo "creating a package ......."
  }
  stage('Deploy'){
    echo "Deploying to dev host "
  }
}
