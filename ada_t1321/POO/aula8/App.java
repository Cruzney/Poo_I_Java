public class App {
    public static void main ( String[] args ) {
        Funcionario f1 = new Funcionario();
        f1.dadosPessoais = new DadosPessoais();
        f1.dadosContratuais = new DadosContratuais();

        f1.dadosPessoais.nome = args[0];
        f1.dadosContratuais.tipo = args[1];
        f1.dadosContratuais.salario = Double.parseDouble(args[2]);

        VisualizarFerias vf = new VisualizarFerias();
        CalcularFerias cf = new CalcularFerias();
        vf.visualizarDados(f1);
    }

    static class VisualizarFerias {
        public void visualizarDados ( Funcionario f ) {
            System.out.println("Nome: " + f.dadosPessoais.nome);
            System.out.println("Tipo: " + f.dadosContratuais.tipo);
            System.out.println("Valor das Ferias: " + new CalcularFerias(f.dadosContratuais.salario, f.dadosContratuais.tipo, 0.0).calcularFerias());
        }

    }
}
