package com.mesut.springsecurity.db;

import com.mesut.springsecurity.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;

    public DbInit(UserRepository userRepository){
        this.userRepository = userRepository ;
    }

    @Override
    public void run(String... args) throws Exception {

        User dan = new User("mesut","password","USER","");
        User admin = new User("admin","password","ADMIN","ACCESS_TEST1, ACCESS_TEST2");
        User manager = new User("manager","password","MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(dan,admin,manager) ;

        //save to db 
        this.userRepository.saveAll(users) ;

    }
}
