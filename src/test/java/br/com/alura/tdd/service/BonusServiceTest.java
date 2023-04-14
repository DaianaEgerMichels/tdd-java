package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    public void deveriaRetornarZeroQuandoOSalarioForAlto(){
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Cristal", LocalDate.now(), new BigDecimal(12000.00)));

        assertEquals(new BigDecimal("0.00"), bonus);
    }
}
