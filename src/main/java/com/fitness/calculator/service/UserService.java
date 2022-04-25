package com.fitness.calculator.service;

import com.fitness.calculator.model.User;
//import com.fitness.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
//    private final UserRepository userRepository;

//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Autowired
    public UserService() {
    }

//    public List<User> getAll() {
//        return userRepository.findAll();
//    }

    public Double getMetabolicIndex(User user) {
        Double imc = null;
        // calcule dupa formula
        imc = user.getWeight() / ((user.getHeight()/100) * (user.getHeight()/100));
        return imc;
    }

    public Double getMetabolicRate(User user) {
        Double bmr = null;

        if (Objects.equals(user.getGender(), "M")) {
            bmr = (88.362 + (13.397 * user.getWeight()) + (4.799 * user.getHeight()) - (5.677 * user.getAge()))
                    * user.getActivityLevel().getIndex();
        } else {
            bmr = (447.593 + (9.247 * user.getWeight()) + (3.098 * user.getHeight()) - (4.330 * user.getAge()))
                    * user.getActivityLevel().getIndex();
        }

        return bmr;
    }
}
