package model;

import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String gerarGraficoArea() {
        Analytics analytics = new Analytics(funcionarios);
        return analytics.gerar(new GraficoArea());
    }

    public String gerarGraficoBarras() {
        Analytics analytics = new Analytics(funcionarios);
        return analytics.gerar(new GraficoBarras());
    }

    public String gerarGraficoLinhas() {
        Analytics analytics = new Analytics(funcionarios);
        return analytics.gerar(new GraficoLinhas());
    }

    public String gerarGraficoPizza() {
        Analytics analytics = new Analytics(funcionarios);
        return analytics.gerar(new GraficoPizza());
    }

    public String gerarGraficoRede() {
        Analytics analytics = new Analytics(funcionarios);
        return analytics.gerar(new GraficoRede());
    }
}
