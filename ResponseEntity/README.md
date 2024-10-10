<h1>What is ResponseEntity?</h1>
ResponseEntity is a powerful tool in Spring Boot that represents the entire HTTP response, including the status code, headers, and body. It allows you to customize the response sent to the client in a flexible and comprehensive manner.

<h3>Key Features</h3>
<h3>Status Code:</h3> You can set the HTTP status code for the response, such as HttpStatus.OK, HttpStatus.BAD_REQUEST, etc.
<h3>Headers:</h3> You can add custom headers to the response.
<h3>Body:</h3> You can include a response body, which can be of any type (e.g., String, JSON, etc.).
<h3>Basic Usage</h3>
Here’s a simple example of how to use ResponseEntity in a Spring Boot controller:

Java

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/age")
    public ResponseEntity<String> age(@RequestParam("yearOfBirth") int yearOfBirth) {
        if (yearOfBirth > 2024) {
            return new ResponseEntity<>("Year of birth cannot be in the future", HttpStatus.BAD_REQUEST);
        }
        int age = 2024 - yearOfBirth;
        return new ResponseEntity<>("Your age is " + age, HttpStatus.OK);
    }

    @GetMapping("/customHeader")
    public ResponseEntity<String> customHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        return new ResponseEntity<>("Custom header set", headers, HttpStatus.OK);
    }
}
<h3>Using Builders</h3>
ResponseEntity also provides builder methods for more concise and readable code:

Java

@GetMapping("/hello")
public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello World!");
}

@GetMapping("/age")
public ResponseEntity<String> age(@RequestParam("yearOfBirth") int yearOfBirth) {
    if (yearOfBirth > 2024) {
        return ResponseEntity.badRequest().body("Year of birth cannot be in the future");
    }
    int age = 2024 - yearOfBirth;
    return ResponseEntity.ok("Your age is " + age);
}

<h3>Setting Headers</h3>
You can set custom headers using the HttpHeaders class:

Java

@GetMapping("/customHeader")
public ResponseEntity<String> customHeader() {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Custom-Header", "foo");
    return ResponseEntity.ok().headers(headers).body("Custom header set");
}
