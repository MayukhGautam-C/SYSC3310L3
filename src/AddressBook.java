import java.util.LinkedList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> list;

    public AddressBook(){
        list = new LinkedList<>();
    }

    public void add(BuddyInfo bi){
        list.add(bi);
    }

    public void remove(BuddyInfo bi){
        list.remove(bi);
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo();
        AddressBook aBook = new AddressBook();
        aBook.add(buddyInfo);
        aBook.remove(buddyInfo);
    }
}
