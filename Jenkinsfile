node {
   
   stage("Checkout scm") {
      checkout scm
   }
   
   stage("build") {
       snDevOpsStep '80478221c7d33300b8e302b827c260b5'
      stage("build on Windows"){
         snDevOpsStep '08478221c7d33300b8e302b827c260b4'
         echo "Building"
      }
       echo "Building1" 
       //sh 'mvn clean install'
       
   }
   stage("test") {
       snDevOpsStep '00478221c7d33300b8e302b827c260b5'
       echo "Testing"
       //sh 'mvn test -Dpublish'
       
       //junit '**/target/surefire-reports/*.xml' 
   }
   
}
