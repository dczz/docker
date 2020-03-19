pipeline{
  agent any
  stages{
    stage("Git Clone") {
      steps{
        git 'https://github.com/dczz/docker.git'
      }
    }
    stage("Build") {
      steps{
         sh 'mvn clean package'
      }
    }

    stage("Connect Docker Server") {
      steps{

      }
    }
    stage("Publisher") {
      steps{

      }
    }
  }
}