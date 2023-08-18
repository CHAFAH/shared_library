def call(String stageName) {
  def mavenHome = tool name: "maven3.9.4", type: "maven"
  def mavenCMD = "${mavenHome}/bin/mvn"

  if (stageName == "Clone") {
    sh "git clone https://github.com/CHAFAH/GROUP-PROJECT.git"
  }
  else if (stageName == "Build") {
    sh "${mavenCMD} clean package"
  }
  else if (stageName == "SonarQube Report") {
    sh "${mavenCMD} sonar:sonar"
  }
  else if (stageName == "Upload to Nexus") {
    sh "${mavenCMD} deploy"
  }
  else {
    echo "Unknown stage: ${stageName}"
  }
}
