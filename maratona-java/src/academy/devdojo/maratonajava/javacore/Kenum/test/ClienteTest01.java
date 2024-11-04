package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luca", TipoCliente.NATURAL_PERSON, TipoPagamento.DEBIT);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.LEGAL_ENTITY, TipoPagamento.CREDIT);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDIT.calculateDiscount(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("NATURAL_PERSON");
        System.out.println(tipoCliente.getNameReport());
        TipoCliente tipoCliente2 = TipoCliente.typeCustomerByReport("Natural Person");
        System.out.println(tipoCliente2);
    }
}
