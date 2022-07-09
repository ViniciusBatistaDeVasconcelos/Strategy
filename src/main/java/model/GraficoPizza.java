package model;

import java.util.List;

public class GraficoPizza implements Grafico {

    public String gerar(List<Funcionario> funcionarios) {
        return "Gráfico de Pizza. Total de Funcionários: " + funcionarios.size() + ".";
    }
}
