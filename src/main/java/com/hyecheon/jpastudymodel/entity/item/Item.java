package com.hyecheon.jpastudymodel.entity.item;

import com.hyecheon.jpastudymodel.entity.Category;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Data
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private String id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}
