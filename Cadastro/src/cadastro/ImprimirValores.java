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
public class ImprimirValores {
    Scanner scan = new Scanner(System.in);
        String Cliente;
        String Email;
    
    public void ImprimirValores() {
        System.out.println("+========================+");
        System.out.println("Cliente" + Cliente);
        System.out.println("E-mail" + Email);
        System.out.println("+========================+");
    }
    
}
