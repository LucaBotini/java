package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Cheking perms of database");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na classe DataBaseLoader ");
    }
}
