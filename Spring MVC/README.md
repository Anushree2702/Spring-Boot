<h1>Spring MVC (Model-View-Controller)</h1> is a framework within the Spring ecosystem that facilitates building web applications by following the MVC architectural pattern. It separates the application logic into three main components: Model, View, and Controller. This helps in structuring and organizing web applications efficiently.

<h3>Key Components of Spring MVC:</h3>
<h3>Model:</h3> Represents the application's data and business logic. It's often the part where your service layer or data from the database resides.

<h3>View:</h3> The presentation layer that displays the data to the user. Common views include JSP, Thymeleaf, or even front-end frameworks like Angular or React (though external integration is required).

<h3>Controller:</h3> Handles user input and interacts with the model to fulfill user requests. It processes incoming requests, handles user inputs, and returns the appropriate view.

<h3>Basic Flow of Spring MVC:</h3>
1. Request Handling: A client sends a request to the server.
2. DispatcherServlet: The request is intercepted by the DispatcherServlet, the front controller in Spring MVC.
3. Controller: The request is forwarded to the appropriate controller, which handles the business logic.
4. Model: The controller interacts with the model to fetch or process data.
5. View Rendering: The controller returns a view name, which is resolved by a ViewResolver to generate the view (typically HTML or other formats).
6. Response: The generated view is sent back as the HTTP response to the client.
<h3>Example of a Simple Spring MVC Setup:</h3>
<h3>Controller:</h3>
java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "home";  // returns the name of the view (home.jsp or home.html)
    }
}
<h3>View (home.jsp):</h3>
jsp

<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>${message}</h1>
</body>
</html>
<h3>Spring Configuration (application.properties):</h3>

properties

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
In this configuration, Spring knows to look for views inside /WEB-INF/views/ with the .jsp suffix.

<h3>DispatcherServlet</h3>
The DispatcherServlet is the central component in Spring MVC. It acts as the front controller that dispatches requests to the appropriate handlers (controllers). It delegates the request to different parts of the application based on the URL mapping.

<h3>Key Annotations in Spring MVC:</h3>
@Controller: Declares a class as a controller to handle web requests.
@RequestMapping: Maps web requests to specific handler methods.
@GetMapping, @PostMapping, etc.: These annotations are more specific variants of @RequestMapping for different HTTP methods (GET, POST, etc.).
@ModelAttribute: Binds form data or query parameters to model attributes.
@PathVariable: Binds URI template variables to method parameters.
@RequestParam: Binds query parameters to method parameters.
<h3>Spring MVC Advantages:</h3>
1. Loose Coupling: The separation of concerns between model, view, and controller makes the application easier to maintain and test.
2. Form Handling: Spring MVC simplifies form handling and validation.
3. Integration: It integrates seamlessly with other Spring modules like Spring Security, Spring Data, and Spring Boot.
Example of Form Handling:
java

@PostMapping("/submitForm")
public String handleForm(@ModelAttribute("user") User user) {
    // Process the form data
    return "result";
}
This setup ensures that Spring MVC provides a flexible, easy-to-maintain structure for building web applications.
