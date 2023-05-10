import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a placa do veículo:");
        String placaVeiculo = scanner.nextLine();

        System.out.println("Valor do litro do combustível:");
        Double valorLitroCombustivel = scanner.nextDouble();

        System.out.println("A quantidade de quilômetros rodados a 60 KM/H:");
        int kmRodado60 = scanner.nextInt();

        System.out.println("A quantidade de quilômetros rodados a 80 KM/H:");
        int kmRodado80 = scanner.nextInt();

        System.out.println("A quantidade de quilômetros rodados a 100 KM/H:");
        int kmRodado100 = scanner.nextInt();

        System.out.println("A quantidade de quilômetros rodados a 120 KM/H:");
        int kmRodado120 = scanner.nextInt();

        System.out.println("A quantidade de quilômetros rodados a 140 KM/H:");
        int kmRodado140 = scanner.nextInt();
        scanner.close();

        double kmL60 = 30.7;
        double kmL80 = 26.08;
        double kmL100 = 22.4;
        double kmL120 = 18.1;
        double kmL140 = 14.5;

        int contador = 0;
        int velocidade60 = 0;
        int velocidade80 = 0;
        int velocidade100 = 0;
        int velocidade120 = 0;
        int velocidade140 = 0;

        double combustivelUtilizado60 = kmRodado60 / kmL60;
        double combustivelUtilizado80 = kmRodado80 / kmL80;
        double combustivelUtilizado100 = kmRodado100 / kmL100;
        double combustivelUtilizado120 = kmRodado120 / kmL120;
        double combustivelUtilizado140 = kmRodado140 / kmL140;

        double combustivelUtilizadoTotal = combustivelUtilizado60 + combustivelUtilizado80 + combustivelUtilizado100 + combustivelUtilizado120 + combustivelUtilizado140;
        
        double custoTotalViagem = combustivelUtilizadoTotal * valorLitroCombustivel;

        if (kmRodado60 > 0) {
            velocidade60 = 60;
            contador = contador + 1;
        }

        if (kmRodado80 > 0) {
            velocidade80 = 80;
            contador = contador + 1;
        }

        if (kmRodado100 > 0) {
            velocidade100 = 100;
            contador = contador + 1;
        }

        if (kmRodado120 > 0) {
            velocidade120 = 120;
            contador = contador + 1;
        }

        if (kmRodado140 > 0) {
            velocidade140 = 140;
            contador = contador + 1;
        }
        double velocidadeMedia = (velocidade60 + velocidade80 + velocidade100 + velocidade120 + velocidade140) / contador;

        System.out.println();
        System.out.printf("%nPlaca do veiculo: %s", placaVeiculo);
        System.out.printf("%nConsumo total: %.4f", combustivelUtilizadoTotal);
        System.out.printf("%nValor total: R$ %.2f", custoTotalViagem);
        System.out.printf("%nVelocidade média ponderada: %f", velocidadeMedia);
    }
}
