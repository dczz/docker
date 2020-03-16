pipeline{
  stages{
    stage("Git Clone") {
      steps{
        git 'https://github.com/dczz/docker.git'
      }
    }
    stage("Build") {
      steps{
        mvn clean package -DskipTest=true
      }
    }
    stage("Send") {
      steps{
        echo "send to docker server"
      }
    }
    stage("Send") {
      steps{
        echo "ssh server exec docker-compose"
      }
    }
  }
}