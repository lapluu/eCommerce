package com.lapluu.springrestcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login_name;
    private String email;
    private String password;
    private String com_code;
    private String status;
    private String forgot;
    private String logintype;
   // @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
    @OneToOne(mappedBy = "user")
   private UserProfile profile;
    @CreationTimestamp
    private Timestamp creation_date;
    @UpdateTimestamp
    private Timestamp modified_date;

    public void copy(User user){
        this.login_name=user.login_name;
        this.email= user.email;
        this.password=user.password;
        this.com_code=user.com_code;
        this.status=user.status;
        this.forgot= user.forgot;
        this.logintype=user.logintype;

    }
}
