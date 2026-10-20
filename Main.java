public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Kafca, your Ai assisted application designed to help students find their careers.");

        Database db = new Database();
        db.getConnected();
    }
}
