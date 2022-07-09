package model;

import java.util.List;

public class GraficoBarras implements Grafico {

    public String gerar(List<Funcionario> funcionarios) {
        return "Gráfico de Barras. Total de Funcionários: " + funcionarios.size() + ".";
    }
}
