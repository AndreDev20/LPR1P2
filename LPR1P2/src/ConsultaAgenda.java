import java.util.Scanner;

public class ConsultaAgenda {

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    private static final Scanner SC = new Scanner(System.in);

    public ConsultaAgenda() {
        System.out.println("\n== Agendar nova consulta ==");
        this.data = new Data();
        this.hora = new Hora();
        System.out.print("Nome do paciente: ");
        this.nomePaciente = SC.nextLine();
        System.out.print("Nome do médico: ");
        this.nomeMedico = SC.nextLine();
        quantidade++;
    }

    public ConsultaAgenda(int h, int mi, int s, int d, int m, int a, String p, String mdc) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = mdc;
        quantidade++;
    }

    public ConsultaAgenda(Data d, Hora h, String p, String mdc) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = mdc;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setData() {
        this.data = new Data();
    }

    public void setHora(int h, int m, int s) {
        this.hora = new Hora(h, m, s);
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Novo nome do paciente: ");
        this.nomePaciente = SC.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Novo nome do médico: ");
        this.nomeMedico = SC.nextLine();
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.mostra1();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String toString() {
        return "Data: " + getData() + "\nHora: " + getHora()
                + "\nPaciente: " + nomePaciente + "\nMédico: " + nomeMedico;
    }
}
