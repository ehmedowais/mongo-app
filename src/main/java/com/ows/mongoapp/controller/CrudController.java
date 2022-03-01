package com.ows.mongoapp.controller;


import com.ows.mongoapp.model.Book;
import com.ows.mongoapp.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {
    @Autowired
    private CrudService crudService;
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Greetings from Mongo DB");
    }

    @PostMapping("/crudOperations/createBook")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        var b = crudService.saveBook(book);
        return ResponseEntity.ok(b);
    }

    @GetMapping("/crudOperations/findBook/{id}")
    public ResponseEntity<Book> findBook(@PathVariable int id){
        var b = crudService.getBookById(id);
        return ResponseEntity.ok(b);
    }
}
