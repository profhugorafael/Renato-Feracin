package com.hoogle.redesocial.resource;

import com.hoogle.redesocial.domain.User;
import com.hoogle.redesocial.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/0.0.1/users")
@AllArgsConstructor // faz injeção de dependencia
public class UserController {

    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll() {
        userRepository.save(new User(1L, "hgrafa",
                "hgrafa@gmail.com","admin123", true) );
        List<User> users = userRepository.findAll();
        return users;
    }

}
