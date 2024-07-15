pipeline {
  agent any
  stages {

    stage('build') {
      steps {
        sh 'mvn package" '
      }
    }

    stage('test') {
      steps {
        bat 'echo "l\'étape de test" '
      }
    }

    stage('deploy') {
      steps {
        bat 'echo "l\'étape de deploy" '
      }
    }
  }
}
