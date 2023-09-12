package com.example.EBANKBACKEND.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentCompte extends  Compte{
    private double OverDraft;
}
