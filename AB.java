import java.util.*;  // scanner class is present in util package

public class AB     // class name and saved name is not neccessay to be saved as java will envoked the class file by it name not saved file
{
    public static void main(String args[])   //command line arguments
    {
        System.out.println("Hello World");  // class.object.meathid()
        Scanner s = new Scanner(System.in);   // system.in obejct 
        int a = s.nextInt();
        System.out.println(a);
        s.nextLine();
        System.out.println("ENTER YOUR NAME :");
        String  name = s.nextLine();
        System.out.println(name);


    }
}