package jackson.rocha;

import jackson.rocha.locadora.Notebook;
import jackson.rocha.locadora.Precificacao;

public class PrecificacaoPorHora implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }
}
