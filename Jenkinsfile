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
}