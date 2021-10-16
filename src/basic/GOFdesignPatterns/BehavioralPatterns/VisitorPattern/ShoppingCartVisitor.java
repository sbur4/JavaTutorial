package src.basic.GOFdesignPatterns.BehavioralPatterns.VisitorPattern;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}