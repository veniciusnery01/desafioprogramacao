/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundaquestao;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author venic
 */
public class questaoii {
    
    
    public static boolean validate(String password){
        //checando a validação
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{6,12}$";
        //compilando o regex
        Pattern p = Pattern.compile(regex);
  
       
        if (password == null) {
            return false;
        }
        //verificar correspondência entre a senha fornecida e a expressão regular
        Matcher m = p.matcher(password);
  
        // retornando se a senha correponde ao regex 
        return m.matches();
    }
  
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma senha: ");
        String password = sc.nextLine();
        
        if(validate(password) == false){
            System.out.println("Senha fraca, mínimo exigido são 6 digitos com (caracteres epeciais, números, letras maiuscúlas e minúsculas) ");
          
            
            
        } else {
            System.out.println("Você digitou uma senha forte");
         
        }
         
       
        System.out.println("A senha digitada tem "+ password.length()+ " caracteres");
    }
}
