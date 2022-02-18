/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiraquestao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author venic
 */
public class questaoiii {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> anagramas = new ArrayList<String>();

        System.out.println("Digite uma palavra: ");
        String word = sc.nextLine();

        //pecorrendo a quantidade de caracteres digitado e verificando o caracter digitado
        for(int i = 0; i <word.length(); i++) {
            
            for(int j = 1; j < word.length(); j++) {
                
                if(word.charAt(i) == word.charAt(j) && i !=j && i < j) {
                    
                    if(word.charAt(i) == word.charAt(i+1)) {
                        
                        String x = word.substring(i, i + 1); 
                        anagramas.add(x);
                    
                    } else {
                        //retornando partes das cadeias de caracteres
                        String a = word.substring(i, j);
                        String b = word.substring(i + 1, j + 1);
                        String c = word.substring(i, i + 1);
                        // adicionando caracteres ao array    
                        anagramas.add(a);
                        anagramas.add(b);
                        anagramas.add(c);
                    }
                }
            }
        }

        System.out.println("Pares de anagramas: " + anagramas);
        
        System.out.println("Quantidade: " + anagramas.size());
    }


}