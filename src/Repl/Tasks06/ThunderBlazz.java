package Repl.Tasks06;

public class ThunderBlazz {
    public static void main(String[] args) {

        System.out.println(getThunderBlazz(true, false, 1, 2, 3));
        System.out.println(getThunderBlazz(false, false, 1, 2, 3));
        System.out.println(getThunderBlazz(false, false, 1, 5, 3));
        System.out.println(getThunderBlazz(false, false, 3, 1, 2));
    }
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3){

        if (available||gift)return true;
        else if ((ingredient1==1&&ingredient2==2&&ingredient3==3)||(ingredient1==3&&ingredient2==1&&ingredient3==2))return true;
        else return false;

    }

}
