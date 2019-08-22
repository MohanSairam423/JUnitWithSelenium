node {
   
   stage("Checkout scm") {
      checkout scm
   }
   
   stage("build") {
       snDevOpsStep '3de392a3c7d333008c2c02b827c26099'
      stage("build on Windows"){
         //snDevOpsStep '08478221c7d33300b8e302b827c260b4'
         echo "Building"
      }
       echo "Building1" 
       //sh 'mvn clean install'
       
   }
   stage("test") {
       snDevOpsStep 'b9e392a3c7d333008c2c02b827c26099'
      snDevOpsChange()
       echo "Testing"
       //sh 'mvn test -Dpublish'
       
       //junit '**/target/surefire-reports/*.xml' 
   }
   
}
