package school.cesar.cnib.entities;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String cpf;
    private String nome;
    private Conta conta;

    public Cliente(String cpf){
            this.cpf = cpf;
    }

}
