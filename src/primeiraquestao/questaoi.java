/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiraquestao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author venic
 */
public class questaoi {
    
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> deg = new ArrayList<>();

    System.out.print("Informe a quantidade de degraus da escada: ");
    int tam = sc.nextInt();
 
    //adicionando elementos ao array e concatenando cópias
    for (int i = 0; i < tam; i++) {
        deg.add(" ".repeat(tam - i) + "*".repeat(i + 1));
    }

 
    for (String d : deg ) {
        System.out.println(d);
    }
 

    
    }
}
