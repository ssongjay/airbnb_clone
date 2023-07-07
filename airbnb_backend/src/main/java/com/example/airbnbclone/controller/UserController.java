package com.example.airbnbclone.controller;

import com.example.airbnbclone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.example.airbnbclone.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/new/idcheck")
    @ResponseBody
    public ResponseEntity<String> idOverlapChcek(String email) {
        List<User> result = userService.findByEmail(email);
        if (result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("사용가능"); // 상태코드 200
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("중복"); // 상태코드 409
        }
    }

    @GetMapping("/users/new")
    public String createForm() {
        return "createUserForm";
    }

    @PostMapping("/users/new")
    public String create(UserForm form) {
        LocalDate currentDate = LocalDate.now();
		User user = new User(form.getName(), form.getEmail(), form.getPassword(), Date.valueOf(currentDate));
        userService.addNewUser(user);
        return "redirect:/";
    }
}
