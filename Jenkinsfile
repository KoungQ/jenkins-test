pipeline {
    agent any
    stages {
        stage("Compile") {
            step {
                sh "./gradlew compileJava"
            }
        }

        stage("Build") {
            step {
                sh "./gradlew build"
            }
        }

        stage("Unit test") {
            step {
                sh "./gradlew test"
            }
        }
    }
}