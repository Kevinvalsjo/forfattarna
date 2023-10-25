// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Anvandare myuser = new Anvandare("hej", "bok@email.se");
        Anvandare myuser2 = new Anvandare("bok2", "bok2@email.se");

        System.out.println(myuser.namn);
        System.out.println(myuser2.namn);


        Scanner tangentbord = new Scanner(System.in);
        myuser.namn = tangentbord.next();
        System.out.println(myuser.namn);
        String test = "y";
        /* while (test.equalsIgnoreCase("Y")) {
            //myuser.count();
           test = tangentbord.nextLine();

        }
        System.out.println(myuser.getCounter());
*/

    }
}