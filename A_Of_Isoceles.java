import java.util.Scanner;

public class A_Of_Isoceles{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of same sided");
        double a = s.nextDouble();
        System.out.println("Enter the side of the other side Triangle");
        double b  =s.nextDouble();
        double area = (b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("Area of Isosceles Triangle is: " + area);
    }
}