package com.example.EBANKBACKEND.Entity;


import com.example.EBANKBACKEND.Enum.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    @Id     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dateOp;
    private double  amount;
    private OperationType optype;
    @ManyToOne
    private Compte compte;
}
