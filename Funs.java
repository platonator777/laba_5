import java.util.List;

public class Funs {
    public static void meowsCare(List<Meowable> cats) {
        for (Meowable cat : cats) {
            cat.meow();  // Вызываем meow() для каждого кота
        }
    }
}


