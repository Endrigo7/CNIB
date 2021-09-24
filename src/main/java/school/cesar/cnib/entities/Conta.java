package school.cesar.cnib.entities;

import lombok.Data;

@Data
public class Conta {

    private String numero;
    private double saldo;
    private String senha;

    public void creditar(double valor){
        saldo += valor;
    }

}
