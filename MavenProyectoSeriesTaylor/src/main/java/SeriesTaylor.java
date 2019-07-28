/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hernan Javier
 */


   import java.io.*;
   import java.util.*;
    public class SeriesTaylor {
    
    
       public static float cosinus (float graus)
      
      {
      
         int i;
      
         float s = 0;
      
         int signo = 1;
      
      
      
         for(i=0; i<30; i+=2)
         
         {
         
            s += signo*pow(graus, i) / factorial(i);
         
            signo *= -1;
         
         }
      
      
      
         return s;
      
      }
   
   
   
       public static float sinus (float graus)
      
      {
      
         int i;
      
         float s = 0;
      
         int signo = 1;
      
      
      
         for(i=1; i<30; i+=2)
         
         {
         
            s += signo*pow(graus, i) / factorial(i);
         
            signo *= -1;
         
         }
      
      
      
         return s;
      
      }
   
   
   
       public static float factorial(int graus)
      
      {
      
         int i;
      
         float fact = 1;
      
      
      
         for(i=1; i<=graus; i++)
         
            fact *= i;
      
      
      
         return fact;
      
      }
   
   
   
       public static float pow(float graus, int n)
      
      {
      
      
      
         int i;
      
         float pow =1;
      
      
      
         if(graus==0) 
            return 0;
      
      
      
         for(i=1; i<=n; i++)
         
            pow = pow*graus;
      
      
      
         return pow;
      
      }
    
   
       public static void main(String args[]) {
         float graus, cos,sin;
         System.out.println("entra el valor per saber el sinus y el cossinus: ");
         graus=180;
         graus=graus*(float)(Math.PI/180);
        
         cos=cosinus(graus);
         sin=sinus(graus);
         System.out.println("Sinus: "+sin);
         System.out.println("cosinus: "+cos);
         float f = factorial(5);
         float p = pow(2, 3);
         System.out.println("Factorial : "+f);
         System.out.println("Pow: "+p);
         
       
      }
   
   
   
   
      
   }
