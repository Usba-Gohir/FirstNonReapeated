/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package firstrepeat.firstrepeat;

import java.util.Scanner;

/**
 *
 * @author usbag
 */
public class firstNonRepeated {

    public static char firstNonRepeated(String s) {
        int[] charCounts = new int[300];

        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }

        for (char c : s.toCharArray()) {
            if (charCounts[c] == 1) {
                return c;
            }
        }

        return '\0';    
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("aabbbbsbba"));
    }
}
