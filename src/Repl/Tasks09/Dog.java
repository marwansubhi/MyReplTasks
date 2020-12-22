package Repl.Tasks09;

public class Dog {
    public  String name;
    public String size, color;
    public boolean isFast;
    public char gender;
    public static boolean isAnimal;
    public static boolean isGerman;
    public static boolean isPoppy;


    public void setInfo(String size, String color, String name,char gender, boolean isFast) {
        this.size = size;
        this.color = color;
        this.name = name;
        this.isFast = isFast;
        this.gender = gender;
    }




    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +" name: "+name+" is fast? "+isFast+" gender is: "+gender+" is German? "+isGerman+
                '}';
    }
    public static String isEating(String food){
        return " is eating "+food;
    }

    static {
        isAnimal = true;
        isGerman = true;
        isPoppy = false;
    }
}
class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

       //do dog1.setInfo("large","black","Ryan",'M',true);

        dog1.name = "Fred";
        dog1.color = "Red";
       // dog1.size = "Large";

//        dog2.setInfo("medium","white","alex");
//        dog3.setInfo("small","red","Bob");

        Dog.isAnimal = true;

        System.out.println(dog1);



    }
}
