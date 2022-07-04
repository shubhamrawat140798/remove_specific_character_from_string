/*
Java program to remove a specified character from a given string. 
Sample Output:
Original string:  abcdefabcdeabcdaaa
Charater for Remove: a
result string:  bcdefbcdebcd
*/
import java.util.Scanner;
class Q3{
    public static String removeCharacterFromString(String string,char character) {
        String res="";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!= character){
                res+=string.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
       System.out.print("Compile by Shubham Singh Rawat \n");
       Scanner s = null;
       try{
            s = new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String str= s.nextLine();
            System.out.print("\nEnter a character you want to remove:");
            char ch = s.next().charAt(0);
            System.out.println("\nfinal String: "+removeCharacterFromString(str, ch));
       }
       finally{
            if(s!=null){
                s.close();
            }           
       }
        
    }
}
