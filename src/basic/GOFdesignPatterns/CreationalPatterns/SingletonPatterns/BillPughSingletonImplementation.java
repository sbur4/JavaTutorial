package src.basic.GOFdesignPatterns.CreationalPatterns.SingletonPatterns;

public class BillPughSingletonImplementation {
    private BillPughSingletonImplementation() {
    }

    private static class SingletonHelper {
        private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
    }

    public static BillPughSingletonImplementation getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
