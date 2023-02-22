
import java.util.Scanner;

public class Main{
    
   
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);
       
        System.out.println("");
        System.out.println("------------------------------------------------Welcome------------------------------------------------");
        System.out.println("");
        System.out.print("Please enter your weight in kg: ");
        //takes the uset weight
            double kg = key.nextDouble();
            System.out.println("");
            System.out.println("");
            Bmr mass = new Bmr(kg, kg, kg, kg);
            //Prints the user's daily need based on his weight
            System.out.println("Your daily need to keep your weight");
            System.out.println("-------------------------");
                System.out.println("Calories: "+mass.getCalorie()+"cal");
                System.out.println("");
                System.out.println("Protein: "+mass.getWeight()+"g");
                System.out.println("");
                System.out.println("fat: "+mass.getFat()+"g");
                System.out.println("");
                System.out.println("Carb: "+mass.getCarb()+"g");
                System.out.println("-------------------------");
            
        key.close();
    }
}