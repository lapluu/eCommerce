package com.lapluu.springrestcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "wallet_cards")
public class WalletCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private long user_id;
    @Column(name = "card_type")
    private String type;
    @Column(name = "card_number")
    private String number;
    @Column(name = "card_user_name")
    private String userName;
    @Column(name = "card_expiry_date")
    private Date expiry_date;
    @Column(name = "card_security_code")
    private String security_code;
    private long address_id;
    @Column(name = "card_status")
    private String status;
    private Timestamp modified_date;
    public void copy(WalletCard wallet){
        this.modified_date=wallet.modified_date;
        this.status=wallet.status;
        this.user_id=wallet.user_id;
    }
}
