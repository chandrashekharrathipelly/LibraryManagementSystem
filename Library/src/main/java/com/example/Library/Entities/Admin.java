package com.example.Library.Entities;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Admin {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    long admin_id;
    String name;
    String email;

    @OneToMany(mappedBy = "admin")
    List<Request> request;

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "admin_id")
    User user;
}
