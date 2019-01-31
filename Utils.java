
/**
 * A utility program to help with basic console programs1
 * @Auther Nathan Colbath
 * @Version 0.2;
 */

import java.util.*;
import java.awt.*;
public class Utils{

  private static Scanner scan;

  //The master hashmap that holds all the linkedlist and their names
  //allowing us to easily access and alter the lists inside the hashmap
  private static HashMap<String,LinkedList<Object>> lists =
  new HashMap<String, LinkedList<Object>> ();

  //functions used to print output to the user
  public static void print(String str){
    System.out.print(str);
  }

  // Function used to prinst a string to the console on a single line
  public static void print(int str){
    System.out.print(str);
  }

  //Function used to print a float to the console on a single line
  public static void print(float str){
    System.out.print(str);
  }

  //Function used to print a double to the console on a single line
  public static void print(double str){
    System.out.print(str);
  }

  //Function used to print a long to the console on a single line
  public static void print(long str){
    System.out.print(str);
  }

  //Function used to print a Object to the console on a single line
  public static void print(Object str){
    System.out.print(str);
  }

  //functions used to print output to the user
  public static void println(String str){
    System.out.println(str);
  }

  //Function used to print ints to the console
  public static void println(int str){
    System.out.println(str);
  }

  //Function used to print floats to the console
  public static void println(float str){
    System.out.println(str);
  }

  //Function used to print doubles to the console
  public static void println(double str){
    System.out.println(str);
  }

  //Function used to print longs to the console
  public static void println(long str){
    System.out.println(str);
  }

  public static void println(Object str){
    System.out.println(str);
  }

  //Function used to get a string from the console
  public static String getInputString(){
    scan = new Scanner(System.in);
    return scan.nextLine();
  }

  //Function used to get a int from the console
  public static int getInputInt(){
    scan = new Scanner(System.in);
    return scan.nextInt();
  }

  //Function used to get a float from the console
  public static float getInputFloat(){
    scan = new Scanner(System.in);
    return scan.nextFloat();
  }

  //Function used to geta double from the console
  public static double getInputDouble(){
    scan = new Scanner(System.in);
    return scan.nextDouble();
  }

  //Function used to get a long from the console
  public static long getInputLong(){
    scan = new Scanner(System.in);
    return scan.nextLong();
  }

  public static boolean str_equl(String str1, String str2){
    return str1.equals(str2);
  }


  //Ways to quickly add or remove a list
  public static void createList(String listName){
    if(lists.get(listName) == null){
      lists.put(listName,new LinkedList<Object> ());
    }
  }

  //Function used to get a list that the user has created based on
  //a name that the was used to create the list
  public static LinkedList getList(String listName){
    for(int i = 0; i < lists.size(); i++){
      if(lists.get(listName) != null){
        return lists.get(listName);
      }else {
        return null;
      }
    }

    return null;
  }

  //Function used to get the disntance between 2 points
  public static int getDistance(int x1,int y1, int x2, int y2){
    int xx = (int) Math.pow((x1 - x2), 2);
    int yy = (int) Math.pow((y1 - y2), 2);

    return (int) Math.sqrt(xx + yy);
  }

  //Function used to get the distance between 2 points and return it
  //as a double rather than an int4
  public static double getDistnace(double x1, double y1, double x2, double y2){
    double xx = Math.pow((x1 - x2), 2);
    double yy = Math.pow((y1 - y2), 2);

    double distance = Math.abs(Math.sqrt(xx + yy));

    return distance;
  }

  //Function used to get make a name uppercase
  public static String getNameUppercase(String str){
    String letter = str.substring(0,1).toUpperCase();
    String newString = str.substring(1);

    return letter + newString;
  }






  //A sub class that is used to hold all the kinds of sorts that i would ever need
  public static class Sorts {

    //Function used to sort an int array and then return it
    public static int[] toInsertionSort(int[] arrayToSort){
      return null; //To change
    }

    //Function used to sort an int array
    public static void toSelectionSort(int[] arrayToSort){

      int minNumberIndex, tempNumber; //Minumum number and a temperary number

      //Outer loop does the sort and the other loop checks for the smallest value
      for(int index = 0; index < arrayToSort.length - 1; index ++){ //n - 1 sort
        minNumberIndex = index;

        for(int i = index + 1; i < arrayToSort.length; i++){ //Outer loop

          //Check to see if the number we are sorting is smaller
          //then the smallest KNOWN value
          if(arrayToSort[i] < arrayToSort[minNumberIndex]){
            minNumberIndex = i;
          }
        }

        tempNumber = arrayToSort[minNumberIndex]; //Temp value for the number to swap

        //We need to replace the min number with the larger minNumber
        //and then use the temp number index and replace that with the bigger number
        arrayToSort[minNumberIndex] = arrayToSort[index];
        arrayToSort[index] = tempNumber;

      }
    }

  }



  //Function used to take an array and convert it into a String
  public static String getArrayString(int[] array){
    String temp = "";

    for(int i = 0; i < array.length; i++){
      temp += array[i];
    }

    return temp;
  }

  //Other functions will be added to this class such as
  //math functions and other io functions
}
