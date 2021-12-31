/*Name: Om G. Panchwate
ID Code: 19CM044
Practical No: 10
AIM: Write a Program to demonstrate the use of getter and setter method of Java 
Beans.
*/
import practical.P10;
public class Pra10
{
public static void main(String[] args)
{
P10 p = new P10();
p.setTier("Ace 1");
p.setName("Om");
String a=p.getName();
String b=p.getTier();
System.out.println("Tier = "+b);
System.out.println("UserName = "+a);
}
}