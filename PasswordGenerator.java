package EnesMentoring.Apps;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Password Generator APP
//
// Create a password from your name, surname, birth year, birth country and one special character
// Take those three information from user as a input
// Make sure that provided information has three or more digits.

// - supply your first two digit of birth year as a begining of password
// - supply last two letters from your name
// - supply first two letters from surname
// - supply first two letters from name as a uppercase
//  - supply first letter from name as a lowercase // Can I use char?
// - supply last two letters from surname as a uppercase
//  - supply first letter of your country
// - supply your last three digit of birth year
// - supply one of the char given : . * / $
// - Follow the steps respectively

        Scanner in= new Scanner(System.in);
        System.out.println("Please enter your name and surname");
        String nameSurname= in.nextLine().trim();
        System.out.println("Please enter your birth year and birth country");
        String birthYearAndCountry= in.nextLine();
        System.out.println("Please enter one special character . * / $");

        String specialChar= in.nextLine();

        String firstTwoDigitOfBirthYear = birthYearAndCountry.substring(0,2);
        String lastTwoLettersName= nameSurname.substring((nameSurname.indexOf(" ")-2), nameSurname.indexOf(" "));
        String firstTwoLetterSurname=nameSurname.substring((nameSurname.indexOf(" ")+1), nameSurname.indexOf(" ")+3);
        String firstTwoLetterName=nameSurname.substring(0,2).toUpperCase();
        String firstLetterName=nameSurname.substring(0,1).toLowerCase();
        String lastTwoLetterSurname= nameSurname.substring((nameSurname.length()-2)).toUpperCase();
        String firstLetterCountry= birthYearAndCountry.substring((birthYearAndCountry.indexOf(" ")+1),birthYearAndCountry.indexOf(" ")+2);
        String last3digitOfBirthYear=birthYearAndCountry.substring(1,4);

        String password= (firstTwoDigitOfBirthYear+lastTwoLettersName+firstTwoLetterSurname+firstTwoLetterName+firstLetterName+lastTwoLetterSurname+firstLetterCountry+last3digitOfBirthYear+specialChar);
        System.out.println("Your Password is "+password);


    }
}
