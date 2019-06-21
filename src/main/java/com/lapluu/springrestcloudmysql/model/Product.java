package com.lapluu.springrestcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int cat_id;
    private String description;
    private int price;
    private int sellprice;
    private String color;
    private int size;
    private String product_status;
    private int quantity;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int plimit;

    public void copy(Product product){
        this.name = product.name;
        this.cat_id = product.cat_id;
        this.description = product.description;
        this.price = product.price;
        this.sellprice = product.sellprice;
        this.color = product.color;
        this.size = product.size;
        this.product_status = product.product_status;
        this.quantity = product.quantity;
        this.date = product.date;
        this.plimit = product.plimit;
    }

}
