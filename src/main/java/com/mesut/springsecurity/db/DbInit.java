package com.mesut.springsecurity.db;

import com.mesut.springsecurity.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder ;


    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository ;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        this.userRepository.deleteAll();

        User dan = new User("mesut",passwordEncoder.encode("password"),"USER","");
        User admin = new User("admin",passwordEncoder.encode("password"),"ADMIN","ACCESS_TEST1, ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("password"),"MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(dan,admin,manager) ;

        //save to db
        this.userRepository.saveAll(users) ;

    }
}
