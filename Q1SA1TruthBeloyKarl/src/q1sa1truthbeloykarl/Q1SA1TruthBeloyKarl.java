package q1sa1truthbeloykarl;
import java.util.Scanner;

public class Q1SA1TruthBeloyKarl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kpL, fuelCap, dist, distSum;
        int travels;
        String ifTravel, ifRun;
        
        System.out.print("How far does your car travel on a liter of gas? ");
        kpL = Double.parseDouble(sc.nextLine());
        System.out.printf("How many liters of gas can your car carry? ");
        fuelCap = Double.parseDouble(sc.nextLine());
        
        distSum = 0;
        travels = 0;
        
        while(distSum < 100 || distSum/kpL < fuelCap) {
            System.out.print("Will you travel [y/n]? ");
            ifTravel = sc.nextLine();
            
            if(ifTravel.equalsIgnoreCase("y")) {
                System.out.printf("How many kilometers will you travel? ");
                dist = Double.parseDouble(sc.nextLine());
                
                distSum += dist;
                travels++;
            }
            else if(ifTravel.equalsIgnoreCase("n")) {
                //total travels
                //total dist
                //fuel consumed
                
                System.out.printf("Total travels: %d%n", travels);
                System.out.printf("Total distance covered: %.10f%n", distSum);
                System.out.printf("Fuel consumed: %.10f%n", distSum/kpL);
                
                System.out.print("Will you continue the program [y/n]? ");
                ifRun = sc.nextLine();
                
                if(ifRun.equalsIgnoreCase("y")) {
                    
                }
                else if(ifRun.equalsIgnoreCase("n")) {
                    break;
                }
                else {
                    System.out.println("Invalid input");
                }

            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}