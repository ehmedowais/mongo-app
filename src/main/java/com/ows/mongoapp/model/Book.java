package com.ows.mongoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Book {
    @Field("id")
    @Id
    private int id;
    @Field("isbn")
    private String isbn;
    @Field("title")
    private String title;
    @Field("author")
    private String author;
}
