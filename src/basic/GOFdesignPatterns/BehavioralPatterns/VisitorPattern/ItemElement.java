package src.basic.GOFdesignPatterns.BehavioralPatterns.VisitorPattern;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}