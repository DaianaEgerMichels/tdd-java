package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {


    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
        // classe service para gerenciar o reajuste do salário
        ReajusteService service = new ReajusteService();

        // funcionario criado para validar o método de reajuste
        Funcionario funcionario = new Funcionario("Lara", LocalDate.now(), new BigDecimal("1000.00"));

        // aplica o método de reajuste
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        // valida se o método de reajuste funciona
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());


    }
}
