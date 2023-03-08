package com.athttt.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{
    @Column(name = "name")
    private String name;
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<ProductEntity> products;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
