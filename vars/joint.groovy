def call(String stageName) {
    if ("${stageName}" == 'MAVEN BUILD') {
        sh 'mvn clean package'
    }
    else if ("${stageName}" == 'CODE_COVERAGE') {
        sh 'mvn sonar:sonar'
    }
}
