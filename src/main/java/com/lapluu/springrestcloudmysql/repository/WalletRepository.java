package com.lapluu.springrestcloudmysql.repository;

import com.lapluu.springrestcloudmysql.model.WalletCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<WalletCard, Long> {
}
