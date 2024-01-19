package lt.techin.andzej;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;

public class Main {
    public static void main(String[] args) throws FriendNotFoundException {
        Friend petras = new Friend("Petras", "Petraitis", "Vilnius");
        Friend jonas = new Friend("Jonas", "Jonaitis", "Kaunas");
        Friend kazys = new Friend("Kazys", "Kaziulevicius", "Vilnius");

        MySocialNetwork network = new MySocialNetwork();
        network.addFriend(petras);
        network.addFriend(jonas);
        network.addFriend(jonas);
        network.addFriend(kazys);
        System.out.println(network.getNumberOfFriends());
        System.out.println(network.findFriend("Kazys", "Kaziulvicius"));

    }


}
