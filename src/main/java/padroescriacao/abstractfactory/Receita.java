package padroescriacao.abstractfactory;

public abstract class Receita {
    protected String paciente;
    protected String medico;
    protected String medicamento;

    public abstract void exibirDetalhes();
}