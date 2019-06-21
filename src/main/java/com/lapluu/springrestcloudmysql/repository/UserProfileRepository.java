package com.lapluu.springrestcloudmysql.repository;


import com.lapluu.springrestcloudmysql.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
