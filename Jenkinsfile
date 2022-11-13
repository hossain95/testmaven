pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
        //ansible 'ANSIBLE_HOME'
    }
    parameters {
        choice(
            name: 'envSelected',
            choices: ['dev', 'prod'],
            description: 'Please choose en environment where you want to run?'
        )
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
                sh 'ansible-playbook ansible.yml,
            }
          }
    }
}
