public class IdGenerator {
    public static Integer id = 0;

    public static Integer getId() {
        id++;
        return id;
    }


}
