
/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MainMenu
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Welcome To The Programming Languages Program!");
        System.out.println("Press 0 to quit at any time");
        System.out.println("Press 1 to continue");
        int input1 = sc.nextInt();
        menu();

        reasonfordemand reason = new reasonfordemand();
        if(input1==1){
            menu();
            int answer = sc.nextInt();
            //if(answer==1){
            //averagesalary.salary();
            //}
            if(answer==3){
            reason.demand();
            }
        }
        else{
        System.exit(1);
        }
    }
    
    public static void menu(){
    System.out.println("=========================");
    System.out.println("MENU SELECTION ATTRIBUTES");
    System.out.println("=========================");
    System.out.println("What would you like to search");
    System.out.println("Press 2 for Average Salary");
    System.out.println("Press 3 for Reason for Demand");
    //System.out.println("Press 4 for Owner");
    //System.out.println("Press 5 for Creator");
    //System.out.println("Press 6 for GitHub usage ranking");
    //System.out.println("Press 7 for IDE");
    //System.out.println("Press 8 for Frameworks");
    //System.out.println("Press 9 for Key companies");
    //System.out.println("Press 10 for Birthdate");
    }
}

