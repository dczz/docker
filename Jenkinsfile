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

    stage("Send") {
      steps{
        echo "send to docker server"
      }
    }
    stage("Compose") {
      steps{
        echo "ssh server exec docker-compose"
      }
    }
  }
}