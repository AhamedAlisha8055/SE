package application;


public class SingleTon{
    private static SingleTon instance;

    private SingleTon() {}

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    

    public String getTitle() {
        return "DashBoard";
    }
}
