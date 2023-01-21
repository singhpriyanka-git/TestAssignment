**Prerequisites:**
1. Java
2. Git
3. Maven
4. Ecilpse editor

**We can run this by 2 way:**
**First one:**
1. import project directly to eclipse
2. hit on run, run as TestNg.

**Another way using command line:**
**Second one:**
1. mvn -B archetype:generate -DgroupId=rcbPlayer.test.PlayerValidationTest -DartifactId=testAssignment -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
2. mvn compile
3. mvn package
4. mvn test
