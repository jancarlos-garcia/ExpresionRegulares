/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerproyec;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author janca
 */
public class expresiones {
    public static void main(String[] args) {
        String patronA = "[0-5]";

        String patronB = "[a-c]";

      
        String patronC = "[a-z]";

       
        String patronD = "[0-9]";
        
       // String patronE ="[a-z]";
        
             String textoAlfanumerico = "ads12s, asdf215, asdf15s";
             System.out.println("Texto alfanumerico:" + textoAlfanumerico);
             System.out.println("numers"+ patronA);
             System.out.println("patronb"+patronB);
             System.out.println("patronc"+patronC);
             System.out.println("patrond"+patronD);
              String replace1 = textoAlfanumerico.replaceAll(patronA, "X");
              System.out.println("Reemplazo de numeros con X: " + replace1);
   
            //String patronComplejo = "(" + patronC+ patronD+")+"; 
           String patronComplejo = "(" + patronC+ "\\d" + ")+"; 
  
              System.out.println("*************************************************");
              //String texto = "hola, aacc este bbcc es mi 55222aaa texto 2663aaaa   blah blah";
              String cadena ="adsfa0s534, asdf541sa32, grgbrdf54";
                 String subtitucion=cadena.replaceAll("0", "");
                System.out.println(subtitucion);
                System.out.println("patron complejo:" + patronComplejo);
              //System.out.println(texto);
              //System.out.println(cadena);
        
              System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
              System.out.println("patron complejo:" + patronComplejo);
              System.out.println(subtitucion);
              Pattern pattern = Pattern.compile(patronComplejo);
              Matcher matcher = pattern.matcher(subtitucion);
              while (matcher.find()) {
              System.out.println("Encontrado:" + matcher.group());
        }
    }
    
}
