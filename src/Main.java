
public class Main {



    public static void main(String[] args) {

        userList userdb = new userList();


        userdb.addUser(new User("nagibator","12345678","nagibator@gmail.com"));
        userdb.addUser(new User("nagibator","55555555","nagibator@gmail.com"));
        userdb.addUser(new User("anonim","12345678","anonim@gmail.com"));



        System.out.println(userdb.getList());



    }
}
