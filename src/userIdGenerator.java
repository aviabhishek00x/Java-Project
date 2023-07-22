/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aviab
 */
public class userIdGenerator {

    private static int lastNumber = 0;

    public static String generaternext() {
        lastNumber++;
        return String.format("%06d", lastNumber);
    }

}
