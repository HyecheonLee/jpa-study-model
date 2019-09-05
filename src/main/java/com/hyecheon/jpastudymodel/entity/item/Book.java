package com.hyecheon.jpastudymodel.entity.item;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Data
public class Book extends Item {
    private String author;
    private String isbn;
}
