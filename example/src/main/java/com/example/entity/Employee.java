package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
