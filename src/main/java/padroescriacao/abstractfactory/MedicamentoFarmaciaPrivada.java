package padroescriacao.abstractfactory;

public class MedicamentoFarmaciaPrivada extends Medicamento {

    public MedicamentoFarmaciaPrivada(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Medicamento Privado: " + nome + " - Preço: R$" + preco);
    }
}