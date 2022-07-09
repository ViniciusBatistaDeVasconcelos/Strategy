package model;

import java.util.List;

public class Analytics {

    private List<Funcionario> funcionarios;

    public Analytics(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String gerar(Grafico grafico) {
        return grafico.gerar(funcionarios);
    }
}
