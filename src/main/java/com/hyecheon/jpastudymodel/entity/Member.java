package com.hyecheon.jpastudymodel.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
