import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    private static final Scanner SC = new Scanner(System.in);

    public Hora() {
        System.out.println("== Configurar Hora ==");
        lerHora();
        lerMinuto();
        lerSegundo();
    }

    public Hora(int h, int m, int s) {
        if (!horaValida(h, m, s))
            throw new IllegalArgumentException("Hora inválida: " + h + ":" + m + ":" + s);
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    private void lerHora() {
        while (true) {
            try {
                System.out.print("Hora (0-23): ");
                int h = SC.nextInt();
                if (h >= 0 && h <= 23) { hora = h; break; }
                erro("Hora fora do intervalo.");
            } catch (InputMismatchException e) {
                erro("Digite um número inteiro.");
                SC.next();
            }
        }
    }

    private void lerMinuto() {
        while (true) {
            try {
                System.out.print("Minuto (0-59): ");
                int m = SC.nextInt();
                if (m >= 0 && m <= 59) { minuto = m; break; }
                erro("Minuto fora do intervalo.");
            } catch (InputMismatchException e) {
                erro("Digite um número inteiro.");
                SC.next();
            }
        }
    }

    private void lerSegundo() {
        while (true) {
            try {
                System.out.print("Segundo (0-59): ");
                int s = SC.nextInt();
                if (s >= 0 && s <= 59) { segundo = s; break; }
                erro("Segundo fora do intervalo.");
            } catch (InputMismatchException e) {
                erro("Digite um número inteiro.");
                SC.next();
            }
        }
    }

    private boolean horaValida(int h, int m, int s) {
        return h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59;
    }

    private void erro(String msg) {
        System.err.println("Erro: " + msg);
    }

    public String mostra1() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
