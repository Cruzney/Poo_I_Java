public class CalculadoraIMC {
    public static void main(String[] args) {
        String nome = null;
        double peso = 0.0;
        double altura = 0.0;
        int idade = 0;
        String faixaEtaria = null;
        String sexo = null;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-n" -> nome = args[++i];
                case "-p" -> peso = Double.parseDouble(args[++i]);
                case "-a" -> altura = Double.parseDouble(args[++i]);
                case "-i" -> idade = Integer.parseInt(args[++i]);
                case "-s" -> sexo = args[++i];

                default -> System.out.println("Parâmetro desconhecido: " + args[i]);
            }
        }

        if (nome == null || peso <= 0 || altura <= 0) {
            System.out.println("Erro: Todos os parâmetros devem ser fornecidos corretamente.");
            System.out.println("Uso: java CalculadoraIMC -n <nome> -p <peso> -a <altura> -i <idade> -s <sexo>");
            return;
        }

        if (idade < 19) {
            faixaEtaria = "Criança/Adolescente";
        } else if (idade < 60) {
            faixaEtaria = "Adulto";
        } else {
            faixaEtaria = "Idoso";
        }

        double imc = peso / (altura * altura);

        if (sexo.equals("feminino")) {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc < 25.8) {
                System.out.println("Peso normal");
            } else if (imc < 27.3) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc < 32.3) {
                System.out.println("Acima do peso");
            } else {
                System.out.println("Obeso");
            }
        } else {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc < 26.4) {
                System.out.println("Peso normal");
            } else if (imc < 27.8) {
                System.out.println("Marginalmente acima do peso");
            } else if (imc < 31.1) {
                System.out.println("Acima do peso");
            } else {
                System.out.println("Obeso");
            }
        }

        System.out.println("Paciente: " + nome);
        System.out.println("Peso: " + String.format("%.2f", peso) + " kg");
        System.out.println("Altura: " + String.format("%.2f", altura) + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Faixa etaria: " + faixaEtaria);
    }
}
