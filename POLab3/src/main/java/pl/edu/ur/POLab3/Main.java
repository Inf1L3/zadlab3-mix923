/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 **
 ** @author  Mateusz Molik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
       
        
      
      Scanner  odczyt=new Scanner(System.in);
      while(true)
      {
          System.out.println("Podaj któro zadanie wykonać");
          int n=odczyt.nextInt();
          switch(n)
          {
              case 1:
              {
                 Zad1_4(); 
                 
              }
               break;
              case 2:
              {
                 Zad1_7(); 
                 
              }
               break;
              case 3:
              {
                 Zad2_2(); 
                 
              }
               break;
               case 4:
              {
                 Zad3_3(); 
                 
              }
              break;
               case 5:
              {
                 Zad3_4(); 
                 
              }
               break;
                     
          }
      }
      
        
        //Zad1_4();
        //Zad1_7();
        //Zad2_2();
        //Zad3_3();
        //Zad3_4();
    }

    private static void Zad1_4() {
        Scanner  odczyt=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=odczyt.nextInt();
        System.out.println("Podaj ile przesuniec bitowych ");
        int n=odczyt.nextInt();
        System.out.println("To jest operator bitowy << -przesuniecie w lewo przesuwa  postać binarą liczby o jedno miejsco w lewo"+(liczba<<n));
        System.out.println("To jest operator bitowy >> -przesuniecie w prawo przesuwa  postać binarą liczby o jedno miejsco w prawo"+(liczba>>n));
        System.out.println("To jest operator bitowy >>> -przesuniecie w prawo bez znaku przesuwa  postać binarą liczby o jedno miejsco w prawo,nie uwzgledniając znaku bitu"+(liczba>>n));
        
    }

    private static void Zad1_7() {
        boolean flaga=true;
        System.out.println("Działanie operatora not "); 
        System.out.println("Prawda rowna się = !" + (!flaga));
        
        System.out.println("Działanie operatora xor "); 
        byte a = 0b00110100;
        byte b = 0b01011011;
        byte result = (byte) (a ^ b);
        System.out.println("Wynik dla xor a^b"+result); 
        
        
    }

    private static void Zad2_2() {
        
      //Działanie toCharArray() 
      String Str = new String("Przykład toCharArray() ");
      System.out.print("Return Value :" );
      System.out.println(Str.toCharArray() );
      
      
      
      //Działanie equals()
      String Str1 = new String("This is really not immutable!!");
      String Str2 = Str1;
      String Str3 = new String("This is really not immutable!!");
      boolean retVal;

      retVal = Str1.equals( Str2 );
      System.out.println("Returned Value = " + retVal );

      retVal = Str1.equals( Str3 );
      System.out.println("Returned Value = " + retVal );
      
      
      //Działanie equalsIgnoreCase()
      String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
      retVal = Str1.equalsIgnoreCase( Str4 );
      System.out.println("Returned Value = " + retVal );
      
      //Działanie campareTo()
      String str1 = "String method tutorial";
      String str2 = "compareTo method example";
      String str3 = "String method tutorial";

      int var1 = str1.compareTo( str2 );
      System.out.println("str1 & str2 comparison: "+var1);

      int var2 = str1.compareTo( str3 );
      System.out.println("str1 & str3 comparison: "+var2);

      int var3 = str2.compareTo("compareTo method example");
      System.out.println("str2 & string argument comparison: "+var3);

      
      Scanner  odczyt=new Scanner(System.in);
      System.out.println("Podaj slowo");
      String przyklad=odczyt.next();
      System.out.println(przyklad.indexOf('m')); //index podanego chara - pierwsze wystapienie
      System.out.println(przyklad.lastIndexOf('a')); //ostatnie wystąpięnie danego chara w stringu
      System.out.println(przyklad.substring(6)); //podział stringu na substring zaczynajac od podanego indexu 
      System.out.println(przyklad.substring(0,6)); //podział stringu na substring od podanego do podanego indexu
      System.out.println(przyklad.replace('a', 'u')); //zamiana litery w stringu
      System.out.println(przyklad.trim()); //przycięcie stringu o nadmiarowe whitespacey
      System.out.println(przyklad.toLowerCase()); //zamiana liter na małe 
      System.out.println(przyklad.toUpperCase()); // zamiana liter na wielkie 

    }

    private static void Zad3_3() {
      Scanner  odczyt=new Scanner(System.in);
      System.out.println("Podaj potege");
      int p=odczyt.nextInt();
      System.out.println("Podaj podstawe");
      int pp=odczyt.nextInt();
      potega_iter(p,pp);
      potega_reku(p,pp);
    }
    
    
    private static void Zad3_4() {
      Scanner  odczyt=new Scanner(System.in);
      System.out.println("Podaj Ktory wyraz fibonacci");
      int n=odczyt.nextInt();
      System.out.println(fibonacci(n));
    }
    
    
    
    public static int potega_iter(int p, int w) {
    if (w == 0)
    return 1;
    return p * potega_iter(p, --w);
    }
    
    public static int potega_reku(int p, int w) {
    int wynik = 1;
    while(w > 0)
    {
      wynik*=p;
      w--;
    }
    return wynik;
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    
    
    
    
  

    
    
       
     

    
}
