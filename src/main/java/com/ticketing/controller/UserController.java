package com.ticketing.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Component
@RequestMapping("/user")
public class UserController {

//    RoleService roleService;
//    UserService userService;
//
//    @Autowired
//    public UserController(RoleService roleService, UserService userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//    @GetMapping({"/create","/add","/initilize"})
//    public String createUser(Model model) {
//        model.addAttribute("user", new UserDTO());
//        model.addAttribute("userList", userService.findAll());
//        model.addAttribute("roleList", roleService.findAll());
//        return "user/create";
//    }
//
//    @PostMapping("/create")
//    public String postUser(@ModelAttribute("user") UserDTO user, Model model){
//        userService.save(user);
////        model.addAttribute("user", new UserDTO());
////        model.addAttribute("userList", userService.findAll());
////        model.addAttribute("roleList", roleService.findAll());
//        return "redirect:/user/create";
//    }
//
//    @GetMapping("/update/{username}")
//    public String editUser(@PathVariable("username") String username, Model model) {
//        model.addAttribute("user", userService.findByID(username));
//        model.addAttribute("userList", userService.findAll());
//        model.addAttribute("roleList", roleService.findAll());
//        return "user/update";
//    }
//
//    @PostMapping("/update/{username}")
//    public String updateUser(@PathVariable("username") String username, UserDTO user) {
//        userService.update(user);
////        model.addAttribute("user", new UserDTO());
////        model.addAttribute("userList", userService.findAll());
////        model.addAttribute("roleList", roleService.findAll());
//        return "redirect:/user/create";
//    }
//
//
//    @GetMapping("/delete/{username}")
//    public String deleteUser(@PathVariable("username") String username) {
//        userService.deleteByID(username);
////        model.addAttribute("user", new UserDTO());
////        model.addAttribute("userList", userService.findAll());
////        model.addAttribute("roleList", roleService.findAll());
//        return "redirect:/user/create";
//    }
}
