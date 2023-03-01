/*
package com.lab.stpis1.service;

import com.lab.stpis1.entity.FashUser;
import com.lab.stpis1.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.getByUsername(username).get();
    }
    public String regiserNewUser(FashUser fashUser){


        if (userRepository.getByUsername(fashUser.getUsername()).isPresent())
        {
            throw new IllegalStateException("Данный username занят");
        }
        else
        {
            //String encodedPassword = passwordEncoder.encode(user.getPassword());
            //user.setPassword(encodedPassword);
            userRepository.save(fashUser);
        }
        //TODO: send confirmation token
        return "redirect:/register";
    }

    public ArrayList<FashUser> findAll() {
        return (ArrayList<FashUser>) userRepository.findAll();

    }

    public FashUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void add(FashUser fashUser){
        userRepository.save(fashUser);
    }

    public Optional<FashUser> findById(Long id){
        return userRepository.findById(id);
    }


    public void delete(Long id) {
        userRepository.delete(findById(id).get());
    }
}
*/
