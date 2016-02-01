/*
 Java - Anagram Finder
This Java program help the user to find if two strings are Anagrams or not.
copyrights @ itzme-vasu
 */

package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class anagrams {
 public static boolean isAnagram(List < Character > a, List < Character > b) {
  if (a.containsAll(b) && b.contains(a) && a.size() == b.size())
   return true;
  else
   return false;
 }
 public static void main(String[] args) {
  int i = 0;
  List < Character > first = new ArrayList < Character > ();
  List < Character > second = new ArrayList < Character > ();
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter the first string:");
  String firstElement = reader.nextLine();
  System.out.println("Enter the second string");
  String secondElement = reader.nextLine();
  for (i = 0; i < firstElement.length(); i++) {

   first.add(firstElement.charAt(i));

  }
  for (int j = 0; j < secondElement.length(); j++) {

   second.add(secondElement.charAt(j));
  }

  if (isAnagram(first, second))
   System.out.println("The given strings are Anagrams");
  else
   System.out.println("The given strings are not Anagrams");

 }
}
