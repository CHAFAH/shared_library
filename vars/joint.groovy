def call(String stageName) {
    if ("${stageName}" == 'MAVEN BUILD') {
        sh 'mvn clean package'
    }
}
