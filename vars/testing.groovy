// vars/testing.groovy

def call(int buildNumber) {
	if (buildNumber % 2 == 0) {
		pipeline {
			agent any
			stages{
				stage('Even Stage'){
				steps{
					echo "This is an Even Stage"
					script{
						log.info 'Starting even build'
						log.warning 'Nothing to do!'
					}
				}
				}
			}
		}
} else {
	pipeline{
		agent any
		stages{
			stage('Uneven Stage'){
			steps{
				echo "This is an Odd Stage"
			script{
			log.info 'Starting odd Build'
			log.warning 'Nothing to do!'
			}
			}
			}
		}
	}
}	
