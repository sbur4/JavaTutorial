package src.basic.JavaEnum;

public class EnumJ {
    enum PIZZA {
        MARGARITA, MOZARELLA, CHAMPIGNON, POMODORINI, PEPERONI
    }

    public static void main(String[] args) {
        PIZZA myVar = PIZZA.PEPERONI;
        System.out.println(myVar + "\n");

        PIZZA myVar2 = PIZZA.CHAMPIGNON;
        // System.out.println(myVar);

        switch (myVar2) {
        case MARGARITA:
            System.out.println("PIZZA " + PIZZA.MARGARITA);
            break;
        case MOZARELLA:
            System.out.println("PIZZA " + PIZZA.MOZARELLA);
            break;
        case CHAMPIGNON:
            System.out.println("PIZZA " + PIZZA.CHAMPIGNON + "\n");
            break;
        case POMODORINI:
            System.out.println("PIZZA " + PIZZA.POMODORINI);
            break;
        case PEPERONI:
            System.out.println("PIZZA " + PIZZA.PEPERONI);
            break;
        }

        for (PIZZA myVar3 : PIZZA.values()) {
            System.out.println(myVar3);
          }
    }
}