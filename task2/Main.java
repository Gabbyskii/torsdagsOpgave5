import java.util.Scanner;

class Main{
  //2.a - main method	
  public static void main(String[]args){
  //2.b - print message to user
  System.out.println("Please type your name");	
   
  //2.c - scanner object
  Scanner scan = new Scanner(System.in); 

  //2.d - declare String 
  String name =  scan.nextLine();


  //2.e - print the name of the user in a greeting & age input ask
  System.out.println("Hello "+ name + "\n Please type your age");	
  
  //2.f - declare age variable and get input
  int age = scan.nextInt();
  
  //2.g - print the age of the user
  System.out.println("You are "+ age + " years old");

  // 2.h - declare new int variable for years till retirement
  int retireAge = 67 - age;
  System.out.println("You have " + retireAge + " years until retirement");

  }

}