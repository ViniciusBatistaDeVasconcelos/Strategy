package model;

import java.util.List;

public class GraficoRede implements Grafico {

    public String gerar(List<Funcionario> funcionarios) {
        return "Gráfico de Rede. Total de Funcionários: " + funcionarios.size() + ".";
    }
}
