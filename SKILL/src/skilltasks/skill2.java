package skilltasks;

public class skill2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "  Hello World  ";

        // 1. Concatenation
        String greet = name + " from Java";
        System.out.println(greet); // Hello World from Java

        // 2. Trim (removes spaces)
        System.out.println(name.trim()); // Hello World

        // 3. Upper case
        System.out.println(name.toUpperCase()); //   HELLO WORLD  

        // 4. Substring (from 2nd to 7th character)
        System.out.println(name.substring(2, 7)); // llo W

        // 5. Replace
        System.out.println(name.replace("World", "Java")); //   Hello Java

        // 6. Split
        String[] words = name.trim().split(" ");
        for (String word : words) {  
            System.out.println(word); // Hello \n World
        }
	}

}
