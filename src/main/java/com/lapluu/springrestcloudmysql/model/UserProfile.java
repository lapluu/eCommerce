package com.lapluu.springrestcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "UserProfile")
@Table(name="users_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "last_name")
    private String  lastName;
    @Column(name = "first_name")
    private String  firstName;
    private String gender;
    private Timestamp modified_date;
  //  private long user_id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
    public void copy( UserProfile profile){

        this.firstName=profile.firstName;
        this.lastName=profile.lastName;
        this.gender=profile.gender;
       // this.user_id=profile.user_id;
    }
}
