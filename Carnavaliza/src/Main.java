import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de ingresso:");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso VIP");
        System.out.println("3 - Ingresso Camarote");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                Normal normal = new Normal(50.0);
                normal.imprimeValor();
                break;
            case 2:
                VIP vip = new VIP(100.0, 20.0);
                vip.imprimeValor();
                break;
            case 3:
                Camarote camarote = new Camarote(150.0, 50.0, "Setor A");
                camarote.imprimeValor();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
