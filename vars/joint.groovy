def call(String stageName) {
    if ("${stageName}" == 'MAVEN BUILD') {
        sh 'mvn clean package'
    }
    else if ("${stageName}" == 'DEPLOY_ARTIFACTS') {
        sh 'mvn deploy'
    }
}
