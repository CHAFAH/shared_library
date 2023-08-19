def call(Config name = [:]) {
    sh "echo Hello ${config.name}, today is ${config.dayOfWeek}."
}


