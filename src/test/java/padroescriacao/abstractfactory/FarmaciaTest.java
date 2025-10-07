package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FarmaciaTest {

    @Test
    void deveEmitirReceitaFarmaciaPopular() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPopular();
        Receita receita = fabrica.criarReceita();
        assertTrue(receita instanceof ReceitaFarmaciaPopular);
    }

    @Test
    void deveEmitirReceitaFarmaciaPrivada() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPrivada();
        Receita receita = fabrica.criarReceita();
        assertTrue(receita instanceof ReceitaFarmaciaPrivada);
    }

    @Test
    void deveEmitirMedicamentoFarmaciaPopular() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPopular();
        Medicamento medicamento = fabrica.criarMedicamento();
        assertTrue(medicamento instanceof MedicamentoFarmaciaPopular);
    }

    @Test
    void deveEmitirMedicamentoFarmaciaPrivada() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPrivada();
        Medicamento medicamento = fabrica.criarMedicamento();
        assertTrue(medicamento instanceof MedicamentoFarmaciaPrivada);
    }

    @Test
    void deveConterPrecoComDescontoNaFarmaciaPopular() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPopular();
        Medicamento medicamento = fabrica.criarMedicamento();
        assertEquals(2.0, medicamento.preco, 0.01); // 10.00 * 0.2 = 2.00
    }

    @Test
    void deveConterPrecoCompletoNaFarmaciaPrivada() {
        FabricaAbstrata fabrica = new FabricaFarmaciaPrivada();
        Medicamento medicamento = fabrica.criarMedicamento();
        assertEquals(40.0, medicamento.preco, 0.01);
    }
}
