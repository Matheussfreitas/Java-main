package ConversorMoedas;

import java.util.Scanner;

public class Conversor {
    public void menu() {
        String menu = """
                1) Dólar -> Real
                2) Real -> Dólar
                3) Euro -> Real Brasileiro
                4) Real Brasileiro -> Euro
                5) Peso Argentino -> Real Brasileiro
                6) Real Brasileiro -> Peso Argentino
                7) Sair
                """;
        System.out.println(menu);
    }

    public String converte(double valor, String moeda, String moedaConvertida) {
        ConsultaAPI consulta = new ConsultaAPI();
        DadosAPI novaBusca = consulta.converteMoedas(moeda, moedaConvertida);
        return String.format("%.2f", valor * Double.valueOf(novaBusca.conversion_rate()));
    }

    public void selecionarConversao() {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        double valor = 0;
        var resultado = "";
        try {
            System.out.println("Informe a conversão que deseja realizar: ");
            operacao = scanner.nextInt();
            System.out.println("Informe o valor que deseja converter: ");
            valor = scanner.nextDouble();
            while (operacao != 7) {
                switch (operacao) {
                    case 1:
                        resultado = converte(valor, "USD", "BRL");
                        System.out.println(resultado);
                        break;
                    case 2:
                        resultado = converte(valor, "BRL", "USD");
                        System.out.println(resultado);
                        break;
                    case 3:
                        resultado = converte(valor, "EUR", "BRL");
                        System.out.println(resultado);
                        break;
                    case 4:
                        resultado = converte(valor, "BRL", "EUR");
                        System.out.println(resultado);
                        break;
                    case 5:
                        resultado = converte(valor, "ARS", "BRL");
                        System.out.println(resultado);
                        break;
                    case 6:
                        resultado = converte(valor, "BRL", "ARS");
                        System.out.println(resultado);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("A conversão não foi realizada com sucesso, tente novamente.");
        }
    }
}
