package springboothelloworld.resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello() {
        return "Hello world";
    }
}
