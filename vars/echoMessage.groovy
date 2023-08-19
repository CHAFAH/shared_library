def mavenHome = tool name: "Maven-3.9.3", type: "maven"
def mavenCMD = "${mavenHome}/bin/mvn"
def call() {
    sh "${mavenCMD} clean package"
}
