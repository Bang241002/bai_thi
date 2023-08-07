package com.example.bai_thi.demo;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Entity
@Table(name = "Employees")

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100)
    private String username;
    @Column(length = 100)
    private String wage;

    public User(long id,String username , String wage) {
        this.id = id;
        this.username = username;
        this.wage = wage();
    }

    public User(String bang) {
    }

    public User() {

    }

    private String wage() {
        return null;
    }

    public List<GrantedAuthority> getAuthorities() {

        return Arrays.stream(new String[]{wage}).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

}
