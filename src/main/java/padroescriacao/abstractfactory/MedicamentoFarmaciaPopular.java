package padroescriacao.abstractfactory;

public class MedicamentoFarmaciaPopular extends Medicamento {

    public MedicamentoFarmaciaPopular(String nome, double preco) {
        this.nome = nome;
        this.preco = preco * 0.2;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Medicamento Popular: " + nome + " - Preço final: R$" + preco);
    }
}