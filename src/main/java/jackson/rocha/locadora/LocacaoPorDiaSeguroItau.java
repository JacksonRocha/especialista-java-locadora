package jackson.rocha.locadora;

public class LocacaoPorDiaSeguroItau extends LocacaoPorDia {

    public LocacaoPorDiaSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);

        double dias = Math.ceil(horasUtilizadas / 24d);
        return valorTotal += dias * 5;
    }
}
