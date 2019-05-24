# firstSpring
Creating Bean using applicationContext xml file.

This is a very simple way to create the bean using spring.

Steps of building.

1 - Creating maven project using maven-archtype-webapp.

2 - Adding Spring core, Spring Beans, Spring context Dependency Injection to the Pom.xml file, DD.

3 - Creating a bean named Person with 2 variables , id and name

4 - Creating directory resources then creating inside it an applecationContext.xml file inside we will build the bean from

Person class.

5 - Inside runner we will create an object of  ClassPathXmlApplicationContext so we can use it to find the applecationContxt file 

which located inside resources directory.

6 - Then use that object to creat the new person bean object.
