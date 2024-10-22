import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Develop a program that takes the weight (in kilograms) and height (in meters)
//        as input and calculates the BMI, then prints it.
       int weight= 70;
       double height=1.75;
       double bmi= weight / (height * height);
        System.out.println(bmi);

//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.

        Scanner marks = new Scanner(System.in);
        System.out.println("Enter Obtained Marks");
        double oM= marks.nextDouble();
        Scanner marked = new Scanner(System.in);
        System.out.println("Enter the Total Marks");
        double tM= marks.nextDouble();
        double themark = (oM / tM) * 100;
        System.out.println("yor Percentage is "+ themark);
      System.out.println("********************");

//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
        Scanner mony=new Scanner(System.in);
        System.out.println("Enter in USD");
        double us = mony.nextDouble();
        Scanner eur=new Scanner(System.in);
        System.out.println("Exchange rat from USD to eur");
        double eu = mony.nextDouble();
        double amounteur = us * eu;
        System.out.println(" Amount in EUR " + amounteur);
        System.out.println("      ");
     System.out.println("********************");

//        4. Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string


     Scanner ss=new Scanner(System.in);
     System.out.println("enter string");
     String s=ss.nextLine();
     System.out.println(" the length is " + s.length() );
     int len = s.length();
     String rev = new StringBuilder(s).reverse().toString();
     System.out.println("Reversed string: "  + rev);
     System.out.println("********************");

//     5. Develop a program that takes a sentence as input and extracts a substring from
//     it, then prints the extracted substring

     String sentence = "The quick brown fox jumps over the lazy dog";
     int si = 10;
     int eI = 20;
     String substring = sentence.substring(si, eI);
     System.out.println( substring);
     System.out.println("********************");
//     6. Write a program that takes a sentence and a keyword as input, then check if
//     the keyword is present in the sentence and prints the result.

     String thesen = "The quick brown fox jumps over the lazy dog";
     String kW = "jumps";
     System.out.println("Keyword " + kW + " is " +
             (thesen.contains(kW) ? "present" : "not present") +
             " in the sentence.");
     System.out.println("********************");


//        7. Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.

    String thesenteance=  "The quick brown fox jumps over the lazy dog";
        System.out.println(thesenteance.replace("fox","cat"));
        System.out.println("********************");

//        8.Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not

        String string1= "Hellow";
        boolean result = string1.equalsIgnoreCase("hellow");
        System.out.println(result);






















    }}
