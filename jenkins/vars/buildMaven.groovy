def call(){
sh '''#!/usr/bin/env bash 
mvn -B -DskipTests clean package '''
}
