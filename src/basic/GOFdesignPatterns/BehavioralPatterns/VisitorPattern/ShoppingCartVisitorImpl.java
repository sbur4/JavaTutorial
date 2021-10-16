package src.basic.GOFdesignPatterns.BehavioralPatterns.VisitorPattern;

/**
 * Посетитель — это поведенческий паттерн проектирования, который позволяет добавлять в программу
 * новые операции, не изменяя классы объектов, над которыми эти операции могут выполняться.
 */

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}
