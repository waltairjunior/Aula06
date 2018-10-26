/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.Scanner;

/**
 *
 * @author ads
 */
public class AddNotas {
    Scanner scan = new Scanner(System.in);
    
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
    
}
