package com.radionbes.spring.RiverBank.repozitories;

import com.radionbes.spring.RiverBank.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepositories extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
