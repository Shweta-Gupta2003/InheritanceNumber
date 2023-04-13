import java.util.*;
class Number
{
int no1,no2;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no1:");
no1=sc.nextInt();
System.out.println("Enter the no2:");
no2=sc.nextInt();
}
void display()
{
System.out.println("No1 is "+no1);
System.out.println("No2 is "+no2);
}
}

class Add extends Number
{
int add;
void addition()
{
add=no1+no2;
}

void display1()
{
System.out.println("Addition of two numbers are "+add);
}

}

class Sub extends Number
{
int sub;
void subtraction()
{
sub=no1-no2;
}

void display2()
{
System.out.println("Subtraction of two numbers are "+sub);
}

}

class Numbers
{
public static void main(String args[])
{
Add a=new Add();
a.getdata();
a.display();
a.addition();
a.display1();

Sub s=new Sub();
s.getdata();
s.display();
s.subtraction();
s.display2();
}
}
