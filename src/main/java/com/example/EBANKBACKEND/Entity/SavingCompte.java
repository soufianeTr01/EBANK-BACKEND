package com.example.EBANKBACKEND.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingCompte extends  Compte{
    private double InterestRate;
}
