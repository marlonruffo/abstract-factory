package padroescriacao.abstractfactory;

public class FabricaFarmaciaPopular implements FabricaAbstrata {

    @Override
    public Receita criarReceita() {
        return new ReceitaFarmaciaPopular("João da Silva", "Dr. Carlos", "Dipirona");
    }

    @Override
    public Medicamento criarMedicamento() {
        return new MedicamentoFarmaciaPopular("Dipirona", 10.00);
    }
}