pipeline {
    agent any
    stages {
        stage {
            stage('Checkout Code'){
                steps {
                    checkout changellog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']]]
                }
            }
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
}