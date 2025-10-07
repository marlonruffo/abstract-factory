package padroescriacao.abstractfactory;

public class ReceitaFarmaciaPrivada extends Receita {

    public ReceitaFarmaciaPrivada(String paciente, String medico, String medicamento) {
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Receita - Farmácia Privada ===");
        System.out.println("Paciente: " + paciente);
        System.out.println("Médico: " + medico);
        System.out.println("Medicamento: " + medicamento);
    }
}