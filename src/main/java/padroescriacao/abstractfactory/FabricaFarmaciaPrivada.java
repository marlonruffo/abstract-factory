package padroescriacao.abstractfactory;

public class FabricaFarmaciaPrivada implements FabricaAbstrata {

    @Override
    public Receita criarReceita() {
        return new ReceitaFarmaciaPrivada("Maria Souza", "Dra. Ana", "Amoxicilina");
    }

    @Override
    public Medicamento criarMedicamento() {
        return new MedicamentoFarmaciaPrivada("Amoxicilina", 40.00);
    }
}