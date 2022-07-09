package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpresaTest {

    Empresa empresa;

    @BeforeEach
    void setUp() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Isabela Antonella Pires", "365.609.482-93", 3050.0f));
        funcionarios.add(new Funcionario("Guilherme Igor Marcelo da Rosa", "023.133.984-47", 4200.5f));
        funcionarios.add(new Funcionario("Yuri Lucca Benjamin Melo", "500.773.918-96", 5600.0f));
        funcionarios.add(new Funcionario("Elisa Kamilly Andreia Fogaça", "214.589.332-61", 2900.0f));
        funcionarios.add(new Funcionario("Bento Gustavo Costa", "192.300.501-48", 2500.9f));

        empresa = new Empresa(funcionarios);
    }

    @Test
    void deveGerarGraficoArea() {
        assertEquals("Gráfico de Área. Total de Funcionários: 5.", empresa.gerarGraficoArea());
    }

    @Test
    void deveGerarGraficoBarras() {
        assertEquals("Gráfico de Barras. Total de Funcionários: 5.", empresa.gerarGraficoBarras());
    }

    @Test
    void deveGerarGraficoLinhas() {
        assertEquals("Gráfico de Linhas. Total de Funcionários: 5.", empresa.gerarGraficoLinhas());
    }

    @Test
    void deveGerarGraficoPizza() {
        assertEquals("Gráfico de Pizza. Total de Funcionários: 5.", empresa.gerarGraficoPizza());
    }

    @Test
    void deveGerarGraficoRede() {
        assertEquals("Gráfico de Rede. Total de Funcionários: 5.", empresa.gerarGraficoRede());
    }
}