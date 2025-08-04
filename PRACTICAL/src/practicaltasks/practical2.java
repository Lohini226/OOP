package practicaltasks;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class practical2 {
	static void stringComparison() {
	      System.out.println("String Comparison");
	      String a = "World";
	      String b = "World";
	      String c = new String("World");
	      System.out.println("a == b: " + (a == b));
	      System.out.println("a == c: " + (a == c));
	      PrintStream var10000 = System.out;
	      boolean var10001 = a.equals(c);
	      var10000.println("a.equals(c): " + var10001);
	      System.out.println();
	   }

	   static void stringManipulation() {
	      System.out.println("String Manipulation");
	      String text = "  Programming with Java  ";
	      System.out.println("Original: '" + text + "'");
	      System.out.println("Trimmed: '" + text.trim() + "'");
	      System.out.println("Upper Case: " + text.toUpperCase());
	      System.out.println("Lower Case: " + text.toLowerCase());
	      System.out.println("Substring (5-16): " + text.substring(5, 16));
	      System.out.println("Replace: " + text.replace("Java", "C++"));
	      System.out.println();
	   }

	   static void stringImmutability() {
	      System.out.println("String Immutability");
	      String x = "Code";
	      x.concat(" Lab");
	      System.out.println("After concat (without assigning): " + x);
	      x = x.concat(" Lab");
	      System.out.println("After assigning concat: " + x);
	      System.out.println();
	   }

	   static void stringBuilderAndBuffer() {
	      System.out.println("StringBuilder & StringBuffer");
	      StringBuilder builder = new StringBuilder("Data");
	      builder.append(" Structures");
	      System.out.println("StringBuilder: " + String.valueOf(builder));
	      StringBuffer buffer = new StringBuffer("Object");
	      buffer.append(" Oriented");
	      System.out.println("StringBuffer: " + String.valueOf(buffer));
	      System.out.println();
	   }

	   static void dateAndTime() {
	      System.out.println("Date and Time");
	      LocalDate currentDate = LocalDate.now();
	      LocalTime currentTime = LocalTime.now();
	      LocalDateTime currentDateTime = LocalDateTime.now();
	      System.out.println("Date: " + String.valueOf(currentDate));
	      System.out.println("Time: " + String.valueOf(currentTime));
	      System.out.println("Date & Time: " + String.valueOf(currentDateTime));
	      DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	      String formattedDateTime = currentDateTime.format(format);
	      System.out.println("Formatted: " + formattedDateTime);
	      System.out.println();
	   }

	   public static void main(String[] args) {
	      stringComparison();
	      stringManipulation();
	      stringImmutability();
	      stringBuilderAndBuffer();
	      dateAndTime();
	   }

}
