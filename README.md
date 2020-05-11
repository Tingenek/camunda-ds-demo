# camunda-ds-demo
 
 This demo shows how to call MarkLogic Dataservices from Camunda as a java Delegate

 It's based on two projects: 
 a) Camunda JavaProcess App https://docs.camunda.org/get-started/java-process-app/
 b) MarkLogic ml-gradle DataServices example https://github.com/marklogic-community/ml-gradle/tree/master/examples/data-services

### Prerequisites

* Download and setup the ml-gradle 'data-services' example. Make sure the tests run.
* Create the class file if necessary with gradle generateHelloWorld
* Create a jar of the class.  jar cvf test.jar com
* Load the jar into your local maven repo. mvn install:install-file -Dfile=./test.jar -DgroupId=org.example.test -DartifactId=hello.world -Dversion=1.0 -Dpackaging=jar -DgeneratePom=true 

These steps will make sure the jar is pulled into the project as a dependancy and deployed properly in the war. 
See pom.xml.

Create the project with mvn clean install

Drop the created war into your Tomcat webapps. Follow the instructions here: 
https://docs.camunda.org/get-started/java-process-app/deploy/

If you look at the process in Camunda modeller, you will see it calls RunDataService instead of the example code.

