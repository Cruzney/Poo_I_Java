class VisualizaDados {
    VisualizaDados(Funcionario funcionario){

        System.out.println("Nome: " + funcionario.dadosPessoais.nome);
        System.out.println("Data de Nascimento: " + funcionario.dadosPessoais.dataNascimento);
        System.out.println("Cargo: " + funcionario.dadosContratuais.cargo);
        System.out.println("Salario Base: " + funcionario.dadosContratuais.salarioBase);
        System.out.println("Vale Transporte: " + funcionario.dadosContratuais.valeTransporte);
        System.out.println("Salario Liquido: " + new CalcularSalario().CalcularSalario(funcionario));
    }
 
   
}