
package password.checker;
import java.util.*;
/**
 *Abin O Varghese
 */
public class PasswordChecker {

     static Scanner scan = new Scanner(System.in);
     static String key;
     static String pin;
     static int tries=0;
     static void repeat(){
       System.out.println("Enter Your Password");
       System.out.print("Pin:-");
       pin=scan.next();
       key="12345";
       }
    public static void main(String[] args) {
       repeat();
       
       while((pin==key) && tries<2)
       {
           System.out.println("Incorrect Password");
           repeat(); 
           tries++;
       }
       if(key == null ? pin == null : key.equals(pin)){
       System.out.println("Correct Password");
       }
       else
       {
       System.out.println("You Have Excceded Your limit for trying...");
       }
    }
    
}
