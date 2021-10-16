package src.basic.JavaConditions.Switch;

public class SwitchDefault {

    // That if the default statement is used as the last statement in a switch
    // block, it does not need a break.

    public static void main(String[] args) {
        String catName = "Boston";

        switch (catName) {
        case "Kex":
            System.out.println("Cat name is Kex");
            break;
        case "Ju":
            System.out.println("Dog name is Ju");
            break;
        default:
            System.out.println("Where is it?");
        }
    }

}
