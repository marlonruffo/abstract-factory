package padroescriacao.abstractfactory;

public class Cliente {

    public static void main(String[] args) {
        FabricaAbstrata fabricaPopular = new FabricaFarmaciaPopular();
        Receita receitaPopular = fabricaPopular.criarReceita();
        Medicamento medicamentoPopular = fabricaPopular.criarMedicamento();

        receitaPopular.exibirDetalhes();
        medicamentoPopular.exibirInformacoes();


        FabricaAbstrata fabricaPrivada = new FabricaFarmaciaPrivada();
        Receita receitaPrivada = fabricaPrivada.criarReceita();
        Medicamento medicamentoPrivado = fabricaPrivada.criarMedicamento();

        receitaPrivada.exibirDetalhes();
        medicamentoPrivado.exibirInformacoes();
    }
}