//Reverse a string without using loop and inbuilt methods

package Java;
import java.util.Scanner;

public class ReverseAString {
    public static void reverseString(char[] ch,int length){
        if(length > 0){
            System.out.print(ch[length-1]);
            length--;
            //recursive calling method
            reverseString(ch, length);
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine(); 
        char [] ch = str.toCharArray(); // convert string into character array
        int length = ch.length;
        reverseString(ch, length);
    }

    
}


//input 
// Enter a string
// sandhya

//output
//ayhdnas