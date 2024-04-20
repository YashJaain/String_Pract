import java.util.Scanner;

public class StringPract {

    public static void ReverseString(String rev) {
        String revName = "";
        for (int i = rev.length() - 1; i >= 0; i--) {
            revName = revName + rev.charAt(i);

        }
        System.out.print("Reverse of " + rev + " is:- " + revName);
    }

    public static void seprateString(String seprateString) {
        String[] pract = seprateString.split(" ");
        System.out.println("");
        System.out.println("Seprate String:- ");
        for (String item : pract) {
            System.out.println(item);
        }

    }

    public static void StrSplit(String name) {
        String[] str = name.split(" ");
        System.out.print("Splitted String:- ");
        for (String item : str) {
            System.out.println(item);
        }
    }

    public static void SubStr(String name, int index)
    {
        String substring = name.substring(index);
        System.out.println("Sub String is:- "+substring);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:- ");
        String name = sc.nextLine();
        System.out.print("Enter index for substring :- ");
        int index = sc.nextInt();
        System.out.println("Your name :- "+name);
        ReverseString(name);
        seprateString(name);
        StrSplit(name);
        SubStr(name,index);
    }
}
