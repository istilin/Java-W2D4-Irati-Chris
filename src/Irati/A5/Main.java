package Irati.A5;
import java.util.*;

public class Main {
    public static String longestString(ArrayList<String> fruitList) {
        int maxLength = 0;
        String longest = "";
        for (String fruit : fruitList){
            if (fruit.length() > maxLength){
                maxLength = fruit.length();
                longest = fruit;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("pourouma cecropiaefoli");
        fruits.add("berry");
        fruits.add("apple");

        String longest = longestString(fruits);
        System.out.print(longest);
    }


}
