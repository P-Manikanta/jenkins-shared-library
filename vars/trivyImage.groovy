def call() {
    sh 'trivy image manikanta45/youtube:latest > trivyimage.txt'
}
