def call(credentialsId){

    withSonarQubeEnv(credentialsId: 'sonarqube-id') {
         sh 'mvn clean package sonar:sonar'
    }
}