package com.kei.kei.employee.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String pfp;
    private String phone;
    private String jobTitle;

    public Employee(String name, String email, String password, String pfp, String phone, String jobTitle) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.pfp = pfp;
        this.phone = phone;
        this.jobTitle = jobTitle;
    }

}
