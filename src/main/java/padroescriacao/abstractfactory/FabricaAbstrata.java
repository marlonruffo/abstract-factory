package padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Receita criarReceita();
    Medicamento criarMedicamento();
}