def call(String stageName){

  if ("${stageName}" == "Clone")
  {
    sh "git clone https://github.com/CHAFAH/GROUP-PROJECT.git"
  }
  else if ("${stageName}" == "Build")
  {
    sh "mvn clean package"
  }
  else if ("${stageName}" == "SonarQube Report")
  {
    sh "mvn sonar:sonar"
  }
  else if ("${stageName}" == "Upload to Nexus")
  {
     sh "mvn deploy"
  }
}
