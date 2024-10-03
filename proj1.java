import java.util.Scanner;
public class proj1 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        String query;

        System.out.println("Enter your name: ");
            String name = Obj.nextLine();
                System.out.println("Hello " + name);

        do{
        
        System.out.println("enter a number:");
            int varX = Obj.nextInt();
        
        System.out.println("enter a number:");
            int varY = Obj.nextInt();
            
        Obj.nextLine();
        
        if (varX > varY) {
            System.out.println(varX + " is Greater than " + varY);
        }
        else if (varX < varY) {
            System.out.println(varX + " is Less than " + varY);
        }
        else 
        {System.out.println(varX + " is Equal to " + varY);
        }
        System.out.println("Do you want to restart the program? (y/n)");
            query = Obj.nextLine();
    
    } while (query.equalsIgnoreCase("y"));;

Obj.close();
    }
}