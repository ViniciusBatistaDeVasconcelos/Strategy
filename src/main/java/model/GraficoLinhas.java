package model;

import java.util.List;

public class GraficoLinhas implements Grafico {

    public String gerar(List<Funcionario> funcionarios) {
        return "Gráfico de Linhas. Total de Funcionários: " + funcionarios.size() + ".";
    }
}
