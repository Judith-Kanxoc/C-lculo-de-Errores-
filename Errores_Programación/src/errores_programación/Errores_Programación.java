/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores_programación;

import java.util.Scanner;

/**
 *
 * @author luordes
 */
public class Errores_Programación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Ingrese el valor Real ");
         double valorReal = teclado.nextDouble();
         
         System.out.println("Ingrese el valor Aproximado ");
         double ValorAproximado = teclado.nextDouble();
         
         Errores metodos = new Errores();
         
         metodos.ErrorAbsoluto(valorReal, ValorAproximado);
         metodos.ErrorRelativo(valorReal);
         metodos.ErrorRelativoPorcentual();
         metodos.MostrarResultados();
         
         

    }
    
}
