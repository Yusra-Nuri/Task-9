package com.company.main;

 class Task1{
    public static String generateException(){
        String stranger= null;
        return stranger;
    }
}
public class NullPointerExceptionT1 {
    public static void main(String[] args){
        try{
            String Bloom = Task1.generateException();
            Bloom.toString();
        }
        catch (NullPointerException uc){
            System.out.println("Null values here, Stranger");
            uc.printStackTrace();
            //uc.toString();
        }
    }
}
