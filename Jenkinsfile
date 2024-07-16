pipeline {
  agent any
  stages {

    stage('build') {
      steps {
        bat 'mvn package'
      }
    }

    stage('test') {
      steps {
        bat 'mvn test'
      }
    }

    stage('deploy') {
      steps {
        bat 'mvn install'
      }
    }

  }

  post {
        always {
            bat 'echo "Pipeline completed"'
        }

        success {
            bat 'echo "Pipeline completed with success "'
        }

        failure {
            bat 'echo "Pipeline Failed"'
        }
  }
}
