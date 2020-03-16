pipeline{
  stages{
    stage("Git Clone") {
      steps{
        git 'https://github.com/dczz/docker.git'
      }
    }
    stage("Build") {
      steps{
        withMaven(options: [findbugsPublisher(), junitPublisher(ignoreAttachments: false)]) {
                sh 'mvn clean findbugs:findbugs package'
              }
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