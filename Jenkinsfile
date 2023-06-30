pipeline {
    agent any
    stages {
        stage('Build Automation'){
            parallel {
                stage('Maven Build'){
                    steps{
                        sh 'mvn clean install'
                    }
                }
                stage('Maven Test Cases'){
                    steps{
                        sh 'mvn clean test'
                    }
                }
            }
        }
    }
}