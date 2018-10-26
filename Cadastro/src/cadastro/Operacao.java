package cadastro;

import java.util.Scanner;

public class Operacao {

    Scanner scan = new Scanner(System.in);
    public String Cliente;
    public String Email;

    public void Cliente() {
        System.out.println("Digite seu nome:");
        this.Cliente = scan.next();
        System.out.println("Digite seu email:");
        this.Email = scan.next();
    }

    public void ImprimirValores() {
        System.out.println("+========================+");
        System.out.println("Cliente" + Cliente);
        System.out.println("E-mail" + Email);
        System.out.println("+========================+");
    }

    public class Nome {

        public static void main(String[] args) {
            Operacao op = new Operacao();
            op.Cliente();
            op.ImprimirValores();
        }
    }

    public class Operacao {

        Scanner scan = new Scanner(System.in);
        public String Cliente;
        public String Email;
        public int Notas;

        public void Cliente() {
            System.out.println("Digite o seu nome:");
            this.Cliente = scan.next();
            System.out.println("Digite o email do cliente:");
            this.Email = scan.next();
        }
    }

    public void AddNotas() {
        System.out.println("Quantas notas deseja digitar?");
        int n = scan.nextInt();
        Notas = new int[n];
        for (int x = 0; x < n; x++) {
            int numero = x + 1;
            System.out.println(" Entre com a nota" + numero + ":");
            Notas[x] scan.nextInt();
        }
    }

    public void ImprimirNotas() {
        double total = 0;
        for (int x = 0; x < Notas.length; x++) {
            total += Notas[x];
            System.out.println("Nota" + (x + 1) + ":" + Notas[x]);
        }
        double media = total / Notas.length;
        System.out.println("A media é de; " + media);
    }

    public void ImprimirValores() {
        System.out.println("+=================+");
        System.out.println("Cliente: " + this.Cliente);
        System.out.println("Email:" + this.Email);
        this.ImprimirNotas();
        System.out.println("+=================+");
    }

    public static void main(String[] args) {
        Operacao op = new Operacao();
        op.Cliente();
        op.AddNotas();
        op.ImprimirValores();
    }

}
