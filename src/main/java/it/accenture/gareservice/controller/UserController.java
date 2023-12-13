package it.accenture.gareservice.controller;

import it.accenture.gareservice.model.User;
import it.accenture.gareservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> findByIdUser(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }


    @GetMapping
    public List<User> findAllUser()
    {
        List<User> users= (List<User>) userRepository.findAll();
        return users;

    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Long id){
       userRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public  User updateUser(@PathVariable("id") Long id,@RequestBody User user)
    {
        Optional<User> utente = findByIdUser(id);

        if(utente.isPresent()) {
            User u=utente.get();
            u.setNome(user.getNome());
            u.setCognome(user.getCognome());
            u.setUsername(user.getUsername());
            u.setEmail(user.getEmail());
            u.setEmail(user.getEmail());
            return userRepository.save(u);
        }else {
            throw new RuntimeException("Non è possibile trovare l'utente");
        }
    }
}
