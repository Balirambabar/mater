package com.jaybabji.repository;


import com.jaybabji.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooKRepository extends JpaRepository<Book,Integer> {
}
