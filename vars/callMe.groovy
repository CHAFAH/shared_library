def call(Map config = [:]) {
    sh "echo Hello ${config.name}, today is ${config.dayOfWeek}."
    sh "git clone https://github.com/CHAFAH/SPRINGAPP-PROJECT.git"
}
   


