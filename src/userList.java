import java.util.HashSet;
import java.util.Set;

public class userList {

    public Set<User> userList = new HashSet<>();

    public void addUser(User newUser){
        if (userList.contains(newUser) == true){
            System.out.println(newUser.getUsername()+" already exists.");
        } else {
            userList.add(newUser);
        }
    }
    public String getList(){
        return userList.toString();
    }
}
