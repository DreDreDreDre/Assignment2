package ex31;
import java.util.Scanner;

public class App31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double targetHeartRate;
        int age = 0;
        int restingHeartRate = 0;
        double intensity = 0;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your resting heart rate: ");
        restingHeartRate = sc.nextInt();

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
