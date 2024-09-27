package jackson.rocha;

import jackson.rocha.locadora.Locacao;
import jackson.rocha.locadora.LocacaoPorHoraSeguroItau;
import jackson.rocha.locadora.Notebook;

public class Principal {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);

        Locacao locacao = new LocacaoPorHoraSeguroItau(notebook);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$ %.2f%n", valorDevido);
    }
}
