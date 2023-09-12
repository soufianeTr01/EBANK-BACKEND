package com.example.EBANKBACKEND.Entity;


import com.example.EBANKBACKEND.Enum.AccStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private double balance;
    private Date created;
    private AccStatus status;
    private String currency;
    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;
    @ManyToOne
    private Client client;
}
