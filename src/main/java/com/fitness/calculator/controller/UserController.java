package com.fitness.calculator.controller;

import com.fitness.calculator.model.ActivityLevel;
import com.fitness.calculator.model.MetabolicIndexIntake;
import com.fitness.calculator.model.User;
import com.fitness.calculator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "calculator-fitness")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/metabolic-index-intake")
    public ResponseEntity<?> getMetabolicIndexIntake(
            @RequestParam("height") Double height,
            @RequestParam("weight") Double weight,
            @RequestParam("gender") String gender,
            @RequestParam("age") Integer age,
            @RequestParam("activity-level") String activityLevel
    ) {
        User user = new User();
        user.setHeight(height);
        user.setWeight(weight);
        user.setGender(gender);
        user.setAge(age);
        user.setActivityLevel(ActivityLevel.valueOf(activityLevel));

        Double metabolicIndex = userService.getMetabolicIndex(user);
        Double metabolicRate = userService.getMetabolicRate(user);
        MetabolicIndexIntake metabolicIndexIntake = new MetabolicIndexIntake(metabolicIndex, metabolicRate);
        return new ResponseEntity<>(metabolicIndexIntake, HttpStatus.OK);
    }
}
