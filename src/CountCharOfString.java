import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        char character;
        System.out.println(" Enter one string : ");
        string = sc.nextLine();
        System.out.println(" Enter char want count : ");
        character = sc.next().charAt(0);


        int count = 0;
        for (int i = 0;i < string.length(); i++){
            if(character == (string.charAt(i))){
                count++;
            }
        }
        System.out.println(" Count of char is : " + count);
    }
}
