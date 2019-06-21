package com.lapluu.springrestcloudmysql.repository;

import com.lapluu.springrestcloudmysql.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {
}
