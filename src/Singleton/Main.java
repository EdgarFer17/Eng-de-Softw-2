package Singleton;

public class Main {
    static void main(String[] args) {

        DBConnection dbConnection = DBConnection.getINSTANCE();
        DBConnection dbConnection1 = DBConnection.getINSTANCE();
    }
}
