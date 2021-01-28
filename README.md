# springboot-wildfly


## multi-module-springboot-wildfly
Deploy to WildFly 22 with Intellij IDEA successfully.  


## How to use:
1, Pull the repository and Command to the multi-module-springboot-wildfly directory.
2, run mvn command: mvn clean install.
3, open pom file as a project use Intellij IDEA.
4, Edit configuration -> server-> add jboss server local -> choose wildfly server folder.
5, Edit configuration -> deployment ->  add artifacts as this image showed:
Configuration refer to this image:  
springboot-wildfly/multi-module-springboot-wildfly/config-images/wildfly-jboss-config.PNG  

6, click start button to deploy.
