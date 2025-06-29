public class main {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 4;
        int sum;
        if(number1 < number2){
          sum =  add(number1, number2);
        } else {
          sum = substract(number1, number2);
        }
        System.out.println(sum);
    }
    public static void greetStudent (String name) {
        System.out.println("Hallo " + name + " wie geht es dir?");
        System.out.println("Willkommen im Java Bootcamp.");
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int makePositive(int number) {
        if(number < 0 ){
            number = number * -1;
        }
        return number;
    }
    public static int substract(int number1, int number2) {
        return number1 - number2;
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static int evenWeirdness(int number){
        int returnNumber;

        if(number % 2 == 0){
            returnNumber = number;
        } else {
            returnNumber = number * 2;
        }
        return returnNumber;
    }

}
