package Singleton;

import javax.print.attribute.standard.MediaSize;

public class DBConnection {
    private static DBConnection INSTANCE;

    private DBConnection() {
        System.out.println("Conecntando com banco de dados");
    }

    public static DBConnection getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new DBConnection();
            return INSTANCE;
        }
        else {
            return INSTANCE;
        }
    }
}
