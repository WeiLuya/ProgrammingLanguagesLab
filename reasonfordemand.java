
/**
 * Write a description of class reasonfordemand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class reasonfordemand
{
    public void demand()
    {
        Scanner sc = new Scanner(System.in);
        String languages[] = {"Python", "Javascript", "Java", "Swift", "Objective C", "C++", "C", "C#", "Ruby"};
        
        System.out.println('\u000C');
        System.out.println("=========================");
        System.out.println("MENU SELECTION REASON FOR DEMAND");
        System.out.println("=========================");
        System.out.println("Which reason would you like to search? We will tell you which language was created by this person");
        System.out.println("Data Science");
        System.out.println("Websites");
        System.out.println("OOP");
        System.out.println("Apple iOS development");
        System.out.println("Mac OSX");
        System.out.println("Add OOP to C");
        System.out.println("Operating Systems");
        System.out.println("Unity Framework");
        System.out.println("Websites and Apps");

        String input=sc.nextLine();
        String reasonForDemand []= {"Data Science","Websites","OOP","Apple iOS development","Mac OSX","Add OOP to C","Operating Systems","Unity framework","Websites and Apps"};;
    
       
        boolean contains = Arrays.stream(reasonForDemand).anyMatch(input::equals);
        if (contains==true){
        int index = Arrays.asList(reasonForDemand).indexOf(input);
        //System.out.println("Index of the found string: " + index);
        System.out.println("Language: " + languages[index]);
        }
        else {
        System.out.println("Not valid");   
        }
}
}

