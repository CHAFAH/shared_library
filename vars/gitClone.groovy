def call(String stageName){

  if ("${stageName}" == "Clone")
  {
    sh "git clone https://github.com/CHAFAH/GROUP-PROJECT.git"
  }
  else if ("${stageName}" == "Build")
  {
    def mavenHome = tool name: "maven3.9.4", type: "maven"
    def mavenCMD = "${mavenHome}/bin/mvn"
    sh "${mavenCMD} clean package"
  }
  else if ("${stageName}" == "SonarQube Report")
  {
    def mavenHome = tool name: "maven3.9.4", type: "maven"
    def mavenCMD = "${mavenHome}/bin/mvn"
    sh "${mavenCMD} sonar:sonar"
  }
  else if ("${stageName}" == "Upload to Nexus")
  {
    def mavenHome = tool name: "maven3.9.4", type: "maven"
    def mavenCMD = "${mavenHome}/bin/mvn"
    sh "${mavenCMD} deploy"
  }
}
