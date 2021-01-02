package com.ticketing.controller;

import com.ticketing.dto.UserDTO;
import com.ticketing.service.RoleService;
import com.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;


    @GetMapping({"/create"})
    public String createUser(Model model) {
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roleList", roleService.listAllRoles());
        model.addAttribute("userList", userService.listAllUsers());
        return "user/create";
    }

    @PostMapping("/create")
    public String postUser(@ModelAttribute("user") UserDTO user, Model model){
        userService.save(user);
//        model.addAttribute("user", new UserDTO());
//        model.addAttribute("userList", userService.findAll());
//        model.addAttribute("roleList", roleService.findAll());
        return "redirect:/user/create";
    }
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
