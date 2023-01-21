**Prerequisites:**
Java
Git
Maven
Ecilpse editor

**We can run this by 2 way:**
**First one:**
1. import project directly to eciplse
2. hit on run, run as TestNg.

**Another way using command line:**
**Second one:**
mvn -B archetype:generate -DgroupId=rcbPlayer.test.PlayerValidationTest -DartifactId=testAssignment -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
mvn compile
mvn package
java -jar target/testAssignment-1.0-SNAPSHOT.jar
