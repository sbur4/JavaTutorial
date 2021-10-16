package src.basic.GOFdesignPatterns.BehavioralPatterns.TemplateMethodPattern;

/**
 * Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма, перекладывая
 * ответственность за некоторые его шаги на подклассы. Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.
 */

public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
