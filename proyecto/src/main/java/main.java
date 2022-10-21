import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setName("master");
        user.setPassword("3548715");

        userList.add(user);


        userList.forEach(action -> action.getName());

    }
}
