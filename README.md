# Spring Rest Web Service

#### Setup
* _Clone down respoitory_
* _Run Gradle build_
* _Right click on ToDoService and click "run"_

#### JPA

The Greeting object must be converted to JSON. Thanks to Spring’s HTTP message converter support, you don’t need to do this conversion manually. Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter is automatically chosen to convert the Greeting instance to JSON.


#### Application Class
    
The presence of a main method in a web application may seem a little strange at first, but this allows us to run the application as a simple executable JAR. No longer do we need to build a WAR and deploy it to a servlet container. Instead we can simply execute the JAR, which will launch and run the application in an embedded servlet container. By default Boot uses Tomcat but it's possible to use Jetty instead if that's your preference. For the the sake of this tutorial we'll stick with Tomcat.

In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller. These components are easily identified by the @RestController annotation, and the GreetingController below handles GET requests for /greeting by returning a new instance of the Greeting class:


The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.

A key difference between a traditional MVC controller and the RESTful web service controller above is the way that the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, this RESTful web service controller simply populates and returns a Greeting object. The object data will be written directly to the HTTP response as JSON.

This code uses Spring 4’s new @RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view. It’s shorthand for @Controller and @ResponseBody rolled together.



