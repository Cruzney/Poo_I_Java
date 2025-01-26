class CalcularSalario {

    public double CalcularSalario(Funcionario f1) {
        CalcularDesconto cd = new CalcularDesconto();
        double desconto = cd.CalcularDesconto(f1);
        return f1.dadosContratuais.salarioBase - desconto;
    }
}