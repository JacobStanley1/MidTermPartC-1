package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display available genres
        System.out.println("Choose your favorite genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (String genre : genres) {
            System.out.println("- " + genre);
        }
        
        // Get user input for userID and genre
        System.out.print("Enter your userID: ");
        String userID = input.nextLine();
        
        String genre = "";
        boolean isValidGenre = false;
        while (!isValidGenre) {
            System.out.print("Enter your favorite genre: ");
            genre = input.nextLine();
            
            // Check if the entered genre is valid
            for (String validGenre : genres) {
                if (validGenre.equalsIgnoreCase(genre)) {
                    isValidGenre = true;
                    break;
                }
            }
            
            if (!isValidGenre) {
                System.out.println("Invalid genre. Please choose from the following list:");
                for (String validGenre : genres) {
                    System.out.println("- " + validGenre);
                }
            }
        }
        
        // Create new user profile
        UserProfile userProfile = new UserProfile(userID, genre);
        System.out.println("User profile created successfully!");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite genre: " + userProfile.getGenre());
    }
}
