pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }

        stage("Build") {
            steps {
                sh "./gradlew build"
            }
        }

        stage("Unit test") {git
            steps {
                sh "./gradlew test"
            }
        }
    }
}