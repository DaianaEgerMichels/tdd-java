package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if (desempenho == Desempenho.A_DESEJAR) {
            funcionario.reajustarSalario(reajuste(funcionario, "0.03"));
        } else if (desempenho == Desempenho.BOM) {
            funcionario.reajustarSalario(reajuste(funcionario, "0.15"));
        } else if (desempenho == Desempenho.OTIMO) {
            funcionario.reajustarSalario(reajuste(funcionario, "0.20"));
        }
    }

    private BigDecimal reajuste(Funcionario funcionario, String percentualReajuste){
        BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal(percentualReajuste)).setScale(2, RoundingMode.HALF_UP);
        return reajuste;
    }
}
