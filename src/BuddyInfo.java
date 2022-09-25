public class BuddyInfo {
    public String number;
    public String name;
    public String address;

    public BuddyInfo(){
        this("1234567890", "John Doe", "123 Street Street");
    }

    public BuddyInfo(String number, String name, String address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

//    public static void main(String[] args) {
//        BuddyInfo bi = new BuddyInfo("1", "Simpson", "road");
//        System.out.println("Hello World");
//    }
}
