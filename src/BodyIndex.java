import java.util.Scanner;
public class BodyIndex {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float height, weight, bodymassIndex;

        System.out.print("Please enter your height:  ");
        height=input.nextFloat();

        System.out.print("Please enter your weight:  ");
        weight = input.nextFloat();

        bodymassIndex = weight/(height*height);

        System.out.print("Your Body Mass Index is:" +bodymassIndex);

    }
}
