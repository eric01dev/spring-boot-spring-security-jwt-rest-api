package com.example.springbootspringsecurityjwtrestapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootspringsecurityjwtrestapi.models.ERole;
import com.example.springbootspringsecurityjwtrestapi.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByRolename(ERole rolename);
}
