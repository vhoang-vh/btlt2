import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach trong TreeSet:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Phan tu nho nhat: " + names.first());
        System.out.println("Phan tu lon nhat: " + names.last());
    }
}