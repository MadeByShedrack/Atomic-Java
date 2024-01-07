public class Example {

    public static void main(String[] args) {
        System.out.println("Hello world example file");
        calculateAge(2007);
    }

    public static void calculateAge(int birthYear) {
        int myAge = 2024 - birthYear;
        System.out.println("You are " + myAge + " years old");

        if (myAge >= 18) {
            System.out.println("You can drink");
        } else if (myAge == 18) {
            System.out.println("Wow you just turned 18");
        } else {
            System.out.println("You are too young");
            System.out.println("Please leave immediately");
        }
    }
}