package com.example.domain.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private String id;
    private String username;
    private String email;

    public User(String id) {
        this.id = id;
    }

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }


}
