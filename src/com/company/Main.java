package com.company;

public class Main {

    public static void main(String[] args) {
	Scanner console;
   console = new Scanner(System.in);
   Random aRandom = new Random();
   
   int
       prev_low = 1,
       prev_high = 100,
       guess = aRandom.nextInt(prev_high) + prev_low,
       guesses = 0;
   
   

   
   boolean win = false;
   
   String feedback;
   
   

   while(!win)
   {
       System.out.println("My guess is: " + guess);
       feedback = console.nextLine();
       //
       
       if(feedback.equals("Toolow") || feedback.equals("Toohigh") || feedback.equals("correct"))
       {
           if(feedback.equals("Toolow"))
           {
               prev_low = guess;
               System.out.println(feedback);
           }
           else if(feedback.equals("Toohigh"))
           {

               prev_high = guess;
               System.out.println(feedback);
           }
           else if(feedback.equals("correct"))
           {
               System.out.print("I win!");
               win = true;
               System.out.println(feedback);
           }
           
           guess = aRandom.nextInt(prev_high) + prev_low;
         
       }
   }

    }
}
