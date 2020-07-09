package Irati.A4;
import java.util.*;

public class Main {
    public static ArrayList<Integer> toFrontArray(ArrayList<Integer> numbers) {
        int smallest = 0;
        int index = 0;
        for (int i = 0; i < numbers.size()-1; i++){
            if (i==0){
                smallest = numbers.get(i);
                index = i;
            }
            if (numbers.get(i)>numbers.get(i+1)){
                smallest = numbers.get(i+1);
                index = i+1;
            }
        }
        numbers.remove(index);
        numbers.add(0,smallest);

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(12);
        numbers.add(1);
        numbers.add(18);

        ArrayList<Integer> changed_array =  toFrontArray(numbers);
        System.out.print(changed_array);
    }
}



/*A4. Create an array list with a few different values e.g. [5, 7, 10, 12, 1, 18]. Loop through that arrray and find the smallest value inside of it. Take this value and move it to the front of the list.

For that create a method, which takes one parameter of type ArrayList

Example:

Input: [5, 7, 10, 12, 1, 18]

Output: [1, 5, 7, 10, 12, 18]*/