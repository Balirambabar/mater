package com.FrontOffice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Jb_Cust_Dtls")
public class CustomerEnqEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String mobile;
    private String email;
    private String status;
    private String notes;
    @ManyToOne
    @JoinColumn(name = "user_id")  // foreign key column in StudentEnqEntity table
    private UserDtsEntity user;


}
