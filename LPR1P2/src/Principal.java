import java.io.FileWriter;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Criando p1 via construtor parametrizado:");
        ConsultaAgenda p1 = new ConsultaAgenda(14, 30, 0, 10, 7, 2025, "João Silva", "Dra. Ana");

        System.out.println("\n-- Dados de p1 --");
        System.out.println(p1);

        System.out.println("\nCriando p2 via construtor interativo:");
        ConsultaAgenda p2 = new ConsultaAgenda();

        System.out.println("\n-- Dados de p2 --");
        System.out.println(p2);

        System.out.println("\nAlterando p1 via métodos interativos:");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("\n-- Dados atualizados de p1 --");
        System.out.println(p1);

        int totalConsultas = p1.getAmostra();
        System.out.println("\nQuantidade total de consultas: " + totalConsultas);

        try (FileWriter fw = new FileWriter("relatorio_consultas.txt")) {
            fw.write("== Relatório de Consultas ==\n\n");
            fw.write("Consulta 1 (p1):\n" + p1 + "\n\n");
            fw.write("Consulta 2 (p2):\n" + p2 + "\n\n");
            fw.write("Total de consultas: " + totalConsultas + "\n");
            System.out.println("Arquivo 'relatorio_consultas.txt' criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        Data.fecharScanner();
    }
}
