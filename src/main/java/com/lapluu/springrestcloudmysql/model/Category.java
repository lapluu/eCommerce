package com.lapluu.springrestcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Category")
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cat_id;
    private String category_name;
    private String category_image;

    public void  copy(Category category){
        this.category_image=category.category_image;
        this.category_name=category.category_name;
    }

}
