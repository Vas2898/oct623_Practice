import java.util.Scanner;


class Arith{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter First Number :");
int a = input.nextInt();

System.out.println("Enter Second Number :");
int b = input.nextInt();

input.close();

//addition
System.out.println("Addition : "+(a+b));

//Subtraction
System.out.println("Subtraction : "+(a-b));

//Multiplication
System.out.println("Multiplication : "+(a*b));

//division
System.out.println("Division : "+(a/b));

//Modulus
System.out.println("Modulo : "+(a%b));

}
}
