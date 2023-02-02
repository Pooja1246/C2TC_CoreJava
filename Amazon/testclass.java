package com;
import java.util.scanner;
public class Testclass {

    public static void main(string[]args){

        string[] arr= {"prime","Nonprime","Noaccount"};

        string c="Nonprime";
        string T="prime";
        string e="Noaccount";

     scanner in=new scanner(System.in);
     system.out.println("Enter the Account Type" +""+"choose :prime ,Nonprime, noaccount");

     srting name=in.nextLine();

     if (name.equals(c)){
             system.out.println("Free Delivery");

     }
     else if (name.equals(c)) {
             system.out.println("Need to pay the charge of delivery");
     }
     if (name.equals(c)) {
             system.out.println("No access for acc resource");
     
     }  
}
}