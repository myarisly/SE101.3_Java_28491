import com.company.Item;
import com.company.Monster;

public class Main {
    public static void main(String[] args) {

        Item item = new Item(1, "A shiny sword");
        item.setLocation(5);
        System.out.println("Item description: " + item.getDescription());
        System.out.println("Item location: " + item.getLocation());


        Monster monster = new Monster(10, "A fierce dragon");
        System.out.println("Monster description: " + monster.getDescription());
        System.out.println("Monster location: " + monster.getLocation());
    }
}