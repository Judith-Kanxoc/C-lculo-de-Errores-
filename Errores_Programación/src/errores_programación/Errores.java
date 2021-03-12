/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores_programación;

/**
 *
 * @author luordes
 */
public class Errores {
     
    double ErrorAbs;
    double ErrorRel;
    double Error_Rel_Por;
      
    
    public void ErrorAbsoluto(double valorRea,double ValorAproximado ){
        ErrorAbs =(Math.abs(valorRea-ValorAproximado));
        
    }
    public void ErrorRelativo(double valorRea ){
        ErrorRel = ErrorAbs/valorRea;
        
    }
    public void ErrorRelativoPorcentual(){
        Error_Rel_Por = ((ErrorRel* 100));
        
    }
    
    public void MostrarResultados(){
        System.out.println("El Error Absoluto es: " + ErrorAbs);
        System.out.println("El Error Relativo es: " + ErrorRel);
        System.out.println("El Error Relativo Porcentual es: " + Error_Rel_Por);
    }
      
}
