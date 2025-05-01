package interfunc;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("João", 21), new User("Ana", 21));

        // users.forEach((User user) -> {
        //         System.out.println(user);
        //     }
        // );

        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
