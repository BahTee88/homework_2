import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(condition(15,40));
        System.out.println(condition(25,30));
        System.out.println(condition(48,-20));
        System.out.println(condition(17,19));
        System.out.println(condition(56,33));
        System.out.println(condition(generateRandomAge(),45));

    }

    public static String condition(int age,int temperature){
        if (age>20 && age <45 &&  temperature>-20 && temperature<30){
            return "Можно идти гулять";
        } else if (age<20 && temperature>0 && temperature<28) {
            return "Можно идти гулять";
        } else if (age>45 && temperature>-10 && temperature<25)
            return "Можно идти гулять";
        else {
            return ("Оставайтесь дома");
        }

    } public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt (45);
    }


}