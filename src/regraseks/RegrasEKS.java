package regraseks;

import java.util.Scanner;

public class RegrasEKS {

    public static void main(String[] args) {

        int podsPorNode = 10;
        int podsPorServidor = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade Pods desejados: ");
        int numeroTotalPods = scanner.nextInt();
        scanner.close();

        double numeroMinimoNodes = Math.ceil((double) numeroTotalPods / (double) podsPorNode);
        double numeroMinimoServidores = Math.ceil((double) numeroTotalPods / (double) podsPorServidor);

        System.out.println("Nodes necessários: " + String.format("%.0f", numeroMinimoNodes));
        System.out.println("Servidores necessários: " + String.format("%.0f", numeroMinimoServidores));

    }
}
