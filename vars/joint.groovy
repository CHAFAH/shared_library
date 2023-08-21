def call(String stageName) {
    if ("${stageName}" == 'MAVEN BUILD') {
        sh 'mvn clean package'
    }
    else if ("${stageName}" == 'DEPLOY_ARTIFACTS') {
        sh 'mvn deploy'
    }
    else if ("${stageName}" == 'Authorization') {
         timeout(time: 48, unit: 'HOURS') {
                    // some block
                    input message: 'Approve or Decline'
                    }
    }
}
