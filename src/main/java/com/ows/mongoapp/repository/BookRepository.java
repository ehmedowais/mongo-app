package com.ows.mongoapp.repository;

import com.ows.mongoapp.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer> {
}
