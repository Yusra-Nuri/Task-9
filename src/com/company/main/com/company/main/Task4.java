package com.company.main.com.company.main;
//coz push ain't working duhhh
class ExceptionA extends Exception
{
    ExceptionA(String message)
        {super(message);}
}
class ExceptionB extends Exception
{
    ExceptionB(String message)
    {super (message);}
}
class ExceptionC extends Exception{
    ExceptionC(String message)
    {super(message);}
}
public class Task4 {
   public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC{
       if(x < 0) throw new ExceptionA("x < 0");
       if(x == 0) throw new ExceptionB("x == 0");
       if(x > 0) throw new ExceptionC("x > 0");
   }
   public static void main(String[] args){
       try{
           f(-1);
       }
       catch(ExceptionA|ExceptionB|ExceptionC ex){
           ex.printStackTrace(System.out);
       }
   }
}
