package com.lapluu.springrestcloudmysql.repository;
import com.lapluu.springrestcloudmysql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
}
