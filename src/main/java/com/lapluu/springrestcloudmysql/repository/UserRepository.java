package com.lapluu.springrestcloudmysql.repository;

import com.lapluu.springrestcloudmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
