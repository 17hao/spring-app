package xyz.shiqihao.restful;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String template = "Hello, %s!";
        Greeting greeting = new Greeting(id.incrementAndGet(), String.format(template, name));
        return new Gson().toJson(greeting);
    }
}
