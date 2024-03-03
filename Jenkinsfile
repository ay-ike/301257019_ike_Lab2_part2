pipeline {
    agent any
	
	tools{
		maven "MAVEN3"
		jdk "JDK"
	}
	
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ay-ike/301257019_ike_Lab2_part2'
            }
        }
        stage('Maven Build') { 
            steps {
                bat "mvn clean compile"
            }
        }

    }
}