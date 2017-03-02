package sk.stopangin.spbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.stopangin.spbt.model.Resource;
import sk.stopangin.spbt.model.User;
import sk.stopangin.spbt.repository.ResourceRepository;
import sk.stopangin.spbt.repository.UserRepository;
import sk.stopangin.spbt.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired

    UserRepository userRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Autowired
    UserService userService;

    //GET USER BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    private User getUser(@PathVariable("id") Long id) {

        return userRepository.findById(id);
    }

    //GET ALL USERS
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    private Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    //CREATE NEW USER
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    private User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    //DELETE USER BY ID
    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.POST)
    private void delete(@PathVariable("id") Long id){
        userRepository.delete(id);
    }

    //UPDATE USER BY ID
    @RequestMapping(value = "/update",method=RequestMethod.POST)
    private User update(@RequestBody User user) {
      return userService.update(user);
    }
}
