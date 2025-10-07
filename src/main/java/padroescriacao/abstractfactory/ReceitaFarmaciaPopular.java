package padroescriacao.abstractfactory;

public class ReceitaFarmaciaPopular extends Receita {

    public ReceitaFarmaciaPopular(String paciente, String medico, String medicamento) {
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Receita - Farmácia Popular ===");
        System.out.println("Paciente: " + paciente);
        System.out.println("Médico: " + medico);
        System.out.println("Medicamento: " + medicamento + " (subsidiado pelo governo)");
    }
}