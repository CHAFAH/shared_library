def call(String stageName) {
    if ("${stageName}" == 'MAVEN BUILD') {
        sh 'mvn clean package'
    }
    else if ("${stageName}" == 'CODE_COVERAGE') {
        sh 'mvn sonar:sonar'
    }
    else if ("${stageName}" == 'DEPLOY_ARTIFACTS') {
        sh 'mvn deploy'
    }
    else if ("${stageName}" == 'Authorisation') {
         timeout(time: 48, unit: 'HOURS') {
                    // some block
                    input message: 'Approve or Decline'
                    }
    }
}
