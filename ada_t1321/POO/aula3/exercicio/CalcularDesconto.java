class CalcularDesconto {
//     Faixa salarial:
// Salário base até R$ 2000.00: 10% de desconto.
// Salário base de R$ 2000.01 a R$ 5000.00: 15% de desconto.
// Salário base acima de R$ 5000.00: 20% de desconto.
// Vale-transporte (opcional):
// Para quem recebe vale-transporte e tem salário base acima de R$ 2500.00, aplica-se uma taxa adicional de 6% sobre o salário base.

    public double CalcularDesconto(Funcionario f1) {
        double desconto = 0;
        if (f1.dadosContratuais.salarioBase <= 2000.00) {
            desconto = f1.dadosContratuais.salarioBase * 0.10;
        } else if (f1.dadosContratuais.salarioBase > 2000.00 && f1.dadosContratuais.salarioBase <= 5000.00) {
            desconto = f1.dadosContratuais.salarioBase * 0.15;
        } else {
            desconto = f1.dadosContratuais.salarioBase * 0.20;
        }
        if (f1.dadosContratuais.valeTransporte && f1.dadosContratuais.salarioBase > 2500.00) {
            desconto += f1.dadosContratuais.salarioBase * 0.06;
        }
        return desconto;
    }
}
