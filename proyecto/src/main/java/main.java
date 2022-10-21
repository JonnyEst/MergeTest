import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setName("master");
        user.setPassword(numero());

        userList.add(user);

    }

    public static String numero(){
        String nu = "1235456451";
        return nu;
    }
}
