/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import midtermexam_versiona_extensioncode.UserProfile;
import java.util.Scanner;

/**
 *
 * @author madison
 */
public class TestUserprofile {
    public static void main (String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        
        String name = nameInput.nextLine();
        
        Scanner movieInput = new Scanner(System.in);
        System.out.println("Do you like comedy, drama, action, or mystery movies better?: ");
        
        String movie = movieInput.nextLine();
        
        UserProfile profile = new UserProfile(name, movie);
        
        System.out.println("UserProfile created!");
    }
}
