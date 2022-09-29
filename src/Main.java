import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        double metre= 0;
        double miles=0;
        double feet=0;
        double inches=0;
        String trash="";

        System.out.print("Enter a measurement in metres: ");
        if(in.hasNextDouble())
        {
            metre=in.nextDouble();
            in.nextLine();
            System.out.println("You said the length of the rectangle is: " + metre);
            miles=metre/1609.344;
            System.out.println("The measurement in miles is: "+miles);
            feet=metre*3.28084;
            System.out.println("The measurement in feet is: "+feet);
            inches=metre*39.3701;
            System.out.println("The measurement in inches is: " + inches);


        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }

    }
}