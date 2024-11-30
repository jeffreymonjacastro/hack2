package org.dbp.hack2.user.domain;

import org.dbp.hack2.user.infrastructure.BaseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BaseUserRepository<User> userRepository;


//    public User findByEmail(String username, String role) {
//        User user;
//        if (role.equals("ROLE_DRIVER"))
//            user = driverRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        else
//            user = passengerRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        return user;
//    }

//    public UserDetailsService userDetailsService() {
//        return username -> {
//            User user = userRepository
//                    .findByEmail(username)
//                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//            return (UserDetails) user;
//        };
//    }
}
