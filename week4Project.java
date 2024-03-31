package week4;

public class week4Project {

  public static void main(String[] args) {
    
    
    
    //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    
     int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

    //    a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
    //     (i.e. do not use ages[7] in your code). Print the result to the console.  
        
      int result = ages[ages.length - 1] - ages[0];
    
      System.out.println(result);
      
    //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

    //i. Make sure that there are 9 elements of type int in this new array.   
      
        
         
      int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 79, 98};
      
     // ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
     //iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).    
      
      int result2 = ages2[ages2.length - 1] - ages2[0];
         
      System.out.println(result2);
      
     // c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
      
      double totalSum = 0;
      
      for(int age : ages2) {
        totalSum += age;
      }
      
      double average = totalSum / ages2.length;
      System.out.println(average);
      
      
      //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
      
      
      //a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
      
      int numberOfLetters = 0;
      
      for(String name : names) {
        numberOfLetters += name.length();
      }
      
      double average2 = (numberOfLetters / names.length);
      
      System.out.println(average2);
      
      
      //b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
      
      String all = String.join(" ", names);
      System.out.println(all);
      
      
      
      
    
  
  
//      3. How do you access the last element of any array?
  
              //  array.length - 1
  
//
//      4. How do you access the first element of any array?
  
              // index 0 
  
//
//      5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
  
          int[] nameLengths = new int[names.length];
          
          for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
          }
//
//      6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
          int elementSum = 0;
          for (int i = 0; i < nameLengths.length; i++) {
            elementSum += nameLengths[i];
          }
  
          System.out.println("sum of all elements: " + elementSum);
  
             }
//
//      7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
        public static String concatenateWord(String word, int n) {
          
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
        result.append(word);
        }
        return result.toString();
        }
 
  
  
//      8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
        public static String fullName(String firstName, String lastName ) {
          
          return firstName + " " + lastName;
        }
  
  
//      9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//
        public static boolean greatertehn100(int[] arr) {
          
          int sum = 0;
          for(int i : arr) {
            sum += i;
          }
          return sum > 100;
        }
  
  
//      10. Write a method that takes an array of double and returns the average of all the elements in the array.
//
        public static double calculateAverage(double[] arr) {
          
          double sum = 0;
          for (double num : arr) {
             sum += num;
             }
            double avg = sum / arr.length;
            return avg;
              }
  
  
//      11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
        public static boolean averageComparision(double[] array1, double[] array2) {
          
          double average1 = 0;
          double average2 = 0;

          for (double num : array1) {
              average1 += num;
          }
          average1 /= array1.length;
        
          for (double num : array2) {
              average2 += num;
          }
          average2 /= array2.length;

          return average1 > average2;
      }

  
  
//      12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
          return isHotOutside && moneyInPocket > 10.50;
          }
  
  
  
//      13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
  
        public static boolean isOldEnough(boolean hasValidId, int age) {
          age = 21;
          hasValidId = true;
          if (age > 21 && hasValidId == true) {
            System.out.println("Your old enought to drink!");
            
          }
          return hasValidId && age > 21;
        }
   
  
  
    

  }


