pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
//     parameters {
//         choice(
//             name: 'envSelected',
//             choices: ['dev', 'prod'],
//             description: 'Please choose en environment where you want to run?'
//         )
//     }
     stages{
        stage('Git CheckOut'){
            steps{
                git 'https://github.com/hossain95/testmaven.git'
            }
        }
     }
     stages {
          stage('Build Jars') {
            steps {
                sh 'mvn clean package'
            }
          }

          stage('Run Project'){
            steps{
                script{
                    echo "run project"
                    if(env.envSelected == "dev"){
                        echo "running dev environment"
                    }
                    else{
                        echo "running prod environment"
                    }
                }
            }
          }

          stage('deploy project'){
            steps{
                echo "deploy project to the server"
                ansiblePlaybook (credentialsId: 'private-key', disableHostKeyChecking: true, installation: 'ANSIBLE_HOME', inventory: 'hosts', playbook: 'ansible.yml')                //sh 'mvn spring-boot:run'
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
