package ex31;
import java.util.Scanner;

public class App31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ageInput;
        String hrInput;
        double targetHeartRate;
        int age = 0;
        int restingHeartRate = 0;
        double intensity = 0;

        do
        {
            System.out.print("Enter your age: ");
            ageInput = sc.nextLine();
            if(!ageInput.matches("[0123456789.]+"))
            {
                System.out.println("Invalid input. Enter a number.");
            }
        }while(!ageInput.matches("[0123456789.]+"));

        do
        {
            System.out.print("Enter your resting heart rate: ");
            hrInput = sc.nextLine();
            if(!hrInput.matches("[0123456789.]+"))
            {
                System.out.println("Invalid input. Enter a number.");
            }
        }while(!hrInput.matches("[0123456789.]+"));

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(int i = 55; i < 100; i = i + 5)
        {
            System.out.print(i + "%          ");
            intensity = i/100.0;
            targetHeartRate = (((220-age) - restingHeartRate) * intensity) + restingHeartRate;
            System.out.printf("| %3.0f bpm", targetHeartRate);
            System.out.println("");
        }
    }
}
