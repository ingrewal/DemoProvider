node {
  def app
  // def mvnHome = tool name: 'maven3', type: 'maven'
  def mvnCMD = "C://Apps/apache-maven-3.6.3/bin/mvn"

try {
 stage 'SCM Checkout'
  git branch: 'master', credentialsId: '9c27a133-af3d-4387-b756-63f044efe811', url: 'https://github.com/ingrewal/DemoProvider/'
    
 stage 'Maven Build'
  sh  "${mvnCM} -B -DskipTests -f pom.xml clean package"
  
 stage 'Docker Build'
  app = docker.build('DemoProvider')
   
// stage  'Deploy'
  
  notify('Success')
} catch(err) {
  notify("Error ${err}")
  currentBuild.result = 'Failure'
}
} 
  def notify(status){
    emailext (
      to: "grewal.inder@gmail.com",
      subject: "${status}: Jenkins Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """<p>${status}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>""",
      )
      }
