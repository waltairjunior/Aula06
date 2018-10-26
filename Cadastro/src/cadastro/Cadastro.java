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
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Cliente;
        String Email;
        
        System.out.println("Digite seu nome:");
        Cliente = scan.next();
        System.out.println("Digite seu e-mail:");
        Email = scan.next();
        
        System.out.println("+========================+");
        System.out.println("Cliente" + Nome);
        System.out.println("E-mail" + Email);
        System.out.println("+========================+");
    }
    
}
