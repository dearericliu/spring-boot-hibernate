package com.prepare.sprint_boot_hibernate.repository;

import com.prepare.sprint_boot_hibernate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
