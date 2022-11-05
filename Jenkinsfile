pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    parameters {
        choice(
            name: 'envSelected',
            choices: ['dev', 'prod'],
            description: 'Please choose en environment where you want to run?'
        )
    }
     stages {
          stage('SonarQube Analysis') {
            steps {
                echo "sonar qube running"
                //def mvn = tool 'MAVEN_HOME';
//                 withSonarQubeEnv('sonarqube') {
//                     sh "mvn clean package sonar:sonar"
//                 }
//                 timeout(time: 4, unit: 'MINUTES') {
//                     waitForQualityGate abortPipeline: true
//                 }
            }
          }
          stage('Build Jars') {
            steps {
                sh 'mvn clean install package'
            }
          }
          stage('Run Project'){
            steps{
                script{
                    echo "run project"
                    if(env.envSelected == "dev"){
                       echo "running dev environment"
                       //ansiblePlaybook inventory: 'dev.inv'
                    }
                    else{
                          echo "running prod environment"
                    }
                }
            }
          }
//           stage('Run Spring Boot App') {
//             steps {
//                 script {
//                     if (env.envSelected == "dev" || env.envSelected == "test") {
//                         echo 'triggered by dev or test'
//                         ansiblePlaybook installation: 'ansible2', inventory: 'dev.inv', playbook: 'ansible.yml', disableHostKeyChecking: true
//                     } else {
//                         echo 'triggered by prod'
//                         input "Continue Deployment to Prod ? Are you Sure ?"
//                         ansiblePlaybook installation: 'ansible2', inventory: 'dev.inv', playbook: 'ansible.yml', disableHostKeyChecking: true
//                         // check below code for IP ssh based deployment
//                         // for different Ips
//                         // IP address and role goes in dev.inv
//                         /**[webservers]
//                           IP-address ansible_user=ec2-user
//                           **/
//                         // command changes to include crendeitalsId
//                         // private-key values if your jenkins configured key to connect to server IP
//                         // check the screenshot you have
//                         // ansiblePlaybook crendeitalsId: 'private-key', installation: 'ansible2', inventory: 'dev.inv', playbook: 'ansible.yml', disableHostKeyChecking: true
//                     }
//                 }

//             }
//           }
    }
}
