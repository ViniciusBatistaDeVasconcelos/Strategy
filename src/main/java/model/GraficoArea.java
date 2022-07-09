package model;

import java.util.List;

public class GraficoArea implements Grafico {

    public String gerar(List<Funcionario> funcionarios) {
        return "Gráfico de Área. Total de Funcionários: " + funcionarios.size() + ".";
    }
}
