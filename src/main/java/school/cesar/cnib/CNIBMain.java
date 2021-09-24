package school.cesar.cnib;

import school.cesar.cnib.entities.Cliente;

public class CNIBMain {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("", "", null);  //0x10
        Cliente cliente2 = new Cliente();  //0x11

        cliente1.setNome("Jair");  //0x10
        cliente2.setNome("Joao");  //0x11

        System.out.println(cliente1);  //0x10
        System.out.println(cliente2);  //0x10

        cliente2 = cliente1;
        System.out.println(cliente1);  //0x10
        System.out.println(cliente2);  //0x10

        alteraValorVariavel(cliente1);
        System.out.println(cliente1);  //0x10
        System.out.println(cliente2);  //0x10

    }

    public static void alteraValorVariavel(Cliente cliente){
        cliente.setNome("Maria joaquina de Amaral Pereira Goes");  //0x10
    }

    public static void alteraInteiro(int valor){
        valor = 10;
    }

}
