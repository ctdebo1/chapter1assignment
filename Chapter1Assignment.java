//Coding for Assignment 1.1
public class Chapter1Assignment {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }
}

//Coding for Assignment 1.2
public class Chapter1Assignment{
    public static void main(String[] args) {
      for (int i=0; i < 5; i++) {
        System.out.println("Welcome to Java");
      }  
    }
}

//Coding for Assignment 1.3
public class Chapter1Assignment{
    public static void main(String[] args){
        String[] pattern {
            "    J       A       V     V      A    ";
            "    J      A A       V   V      A A   ";
            "J   J     AAAAA       V V      AAAAA  ";
            " J J     A     A       V      A     A "
        };

        for (String java : pattern) {
            System.out.println(java);
        }
    }
}

//Coding for Assignment 1.4
public class Chapter1Assignment {
    public static void main(String[] args) {
        System.out.format("%3s %3s %3s", "a", "a^2", "a^3");
        System.out.println(); //Blank Line
        System.out.format("%3s %3s %3s", "1", "1", "1");
        System.out.println(); //Blank Line
        System.out.format("%3s %3s %3s", "2", "4", "8");
        System.out.println(); //Blank Line
        System.out.format("%3s %3s %3s", "3", "9", "27");
        System.out.println(); //Blank Line
        System.out.format("%3s %3s %3s", "4", "16", "64");
    }
}
