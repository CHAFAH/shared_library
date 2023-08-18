def call(String stageName) {
    switch (stageName) {
        case 'Clone':
            gitClone()
            break
        case 'Build':
            build()
            break
        case 'SonarQube Report':
            sonarQubeReport()
            break
        case 'Upload to Nexus':
            uploadToNexus()
            break
        default:
            echo "Unknown stage: ${stageName}"
            break
    }
}
