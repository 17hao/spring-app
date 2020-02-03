package xyz.shiqihao.example_04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> result = new ArrayList<>();
        User user = new User();
        user.setId(2);
        user.setName("test");
        result.add(user);
        return result;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        User user = new User();
        user.setId(1);
        user.setName("test");
        return user;
    }
}
