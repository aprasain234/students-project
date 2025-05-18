pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'
        // Java tool optional if not defined globally
    }

    environment {
        IMAGE_NAME = 'my-springboot-app'
        TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/aprasain234/students-project'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME:$TAG .'
            }
        }

        stage('Run Container (optional)') {
            steps {
                sh 'docker run -d -p 8081:8080 $IMAGE_NAME:$TAG'
            }
        }
    }
}


