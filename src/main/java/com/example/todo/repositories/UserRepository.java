package com.example.todo.repositories;

import com.example.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User , Long> {




}
