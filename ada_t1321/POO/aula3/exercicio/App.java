class App{
    public static void main(String... a){

        Funcionario f1 = new Funcionario();
        f1.dadosPessoais = new DadosPessoais();
        f1.dadosContratuais = new DadosContratuais();

        f1.dadosPessoais.nome = a[0]; // TODO preencher com valores do a[]
        f1.dadosPessoais.dataNascimento = a[1];
        f1.dadosContratuais.cargo = a[2];
        f1.dadosContratuais.salarioBase = Double.parseDouble(a[3]);
        f1.dadosContratuais.valeTransporte = Boolean.parseBoolean(a[4]);

        VisualizaDados vd = new VisualizaDados(f1);
        CalcularSalario cs = new CalcularSalario();

    }
}