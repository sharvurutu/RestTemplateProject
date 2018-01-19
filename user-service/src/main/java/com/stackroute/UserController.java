package com.stackroute;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName());
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setFirstName("Rutu");
        user.setLastName("Bacchuwar");
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        System.out.println("DELETE");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        System.out.println("Update User : " + user.getFirstName() + " " + user.getLastName());
    }
}
