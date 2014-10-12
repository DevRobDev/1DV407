/*
 * ConsoleEng.java
 * Date: 9 Oktober, 2014
 * Author: Robert Willem Hallink
 */
package YachtClub.View;
import java.util.Scanner;

/*
 * More Info Here!
 */
public class ConsoleEng extends Console { //Class ConsoleEng starts
    
    /* Constructors ==> create new instance */
    public ConsoleEng(Scanner scan)     { super(scan); }    //Constructor
    
    
    
    /* Other methods */
    @Override
    public void presentWelcomeMessage() {   //Method presentWelcomeMessage starts
        
        System.out.println("Hello, Boat Club Manager. Please select an order.");
        
    }   //Method presentWelcomeMessage ends
    
    @Override
    public void presentInstructions() {     //Method presentInstructions starts
        
        System.out.println("(1) Register member. (2) Unregister member. (3) Edit member. (4) Add boat. (5) Delete boat. (6) Edit boat. (7) Assign boat. (8) Unassign boat. (9) Show compact info. (10) Show verbose info. (Q) Quit.");
        System.out.print("Select order: ");
        
    }   //Method presentInstructions ends
    
    @Override
    public void showOrderInstructions(String order) {   //Method showOrderInstructions starts
        
        switch (order) {
            case "Register Member":
                System.out.print("(1) Enter name (first + last) + person number (use space with next command): ");
                break;
            case "Unregister Member":
                System.out.print("(2) Enter person number or ID:  ");
                break;
            case "Edit Member":
                System.out.print("(3) Enter ID + new name (first + last) + new personnumber (use space with next command): ");
                break;
            case "Add Boat":
                System.out.print("(4) Enter type + length in cm (use space with next command): ");
                break;
            case "Delete Boat":
                System.out.print("(5) Enter ID: ");
                break;
            case "Edit Boat":
                System.out.print("(6) Enter ID + new type + new length in cm (use space with next command): ");
                break;
            case "Assign Boat":
                System.out.print("(7) Enter boat ID + person number (use space with next command): ");
                break;
            case "Unassign Boat":
                System.out.print("(8) Enter boat ID: ");
                break;
            default:
                System.out.print("(?) Unknown order: ");
        }
        
    }   //Method showOrderInstructions ends
    
    @Override
    public void showError(String err) { //Method showError starts
        
        switch (err) {
            case "input":
                System.err.println("Error with input. Abort order, retry please.");
                break;
            case "load":
                System.err.println("Error with reading data. Reseting data now!");
                break;
            case "write":
                System.err.println("Error with writing file. Abort order, retry please.");
                break;
            case "does not exist":
                System.err.println("Object does not exist. Abort order, retry please.");
                break;
            case "member does not exist":
                System.err.println("Member does not exist. Abort order, retry please.");
                break;
            case "boat does not exist":
                System.err.println("Boat does not exist. Abort order, retry please.");
                break;
            case "unassign":
                System.err.println("Boat has no assigned member. Abort order, retry please.");
                break;
            case "assign":
                System.err.println("Boat is already assigned to a member. Abort order, retry please.");
                break;
            case "number":
                System.err.println("Personnumber already exists for a member. Abort order, retry please.");
                break;
            case "negative ID":
                System.err.println("ID can not be a negative value. Abort order, retry please.");
                break;
            case "not-positive length":
                System.err.println("Boat length must have a postive value. Abort order, retry please.");
                break;
            default:
                System.err.println("Unknown error. Abort order, retry please.");
        }
        
    }   //Method showError ends
    
    @Override
    public String print(String object) {    //Method print starts
        
        switch (object) {
            case "member":
                return "(Member)";
            case "name":
                return "Name: ";
            case "number":
                return "Person number: ";
            case "boats":
                return "Boats: ";
            case "boat":
                return "(Boat)  ";
            case "type":
                return "Type: ";
            case "length":
                return "Length: ";
            case "member number":
                return "Member Personumber: ";
            case "ID":
                return "ID: ";
            default:
                return "(?)";
        }
        
    }   //Method print ends
    
    @Override
    public void showEmptyList(String contents) {    //Method showEmptyList starts
        
        switch (contents) {
            case "members":
                System.out.println("No members registered yet.");
                break;
            case "boats":
                System.out.println("No boats registered yet.");
                break;
            default:
                System.out.println("Unknown list: ");
        }
        
    }   //Method showEmptyList ebds
    
}   //Class ConsoleEng ends