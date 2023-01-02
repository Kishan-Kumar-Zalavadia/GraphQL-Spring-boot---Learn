package com.graphql.learn.repositories;

import com.graphql.learn.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book, Integer> {
}
