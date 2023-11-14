package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.Users.User;
import com.radionbes.spring.RiverBank.repozitories.UserRepositories;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class UsersService implements UserDetailsService {
    private final UserRepositories userRepositories;
    private final PasswordEncoder passwordEncoder;
    public boolean createUser(User user) {
        String email = user.getEmail();
        if (userRepositories.findByEmail(email) != null) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        log.info("Saving new User with email: {}", email);
        userRepositories.save(user);
        return true;
    }

    public List<User> list() {
        return userRepositories.findAll();
    }

    public User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return userRepositories.findByEmail(principal.getName());
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepositories.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User dos not found!");
        }
        return user;
    }
}
