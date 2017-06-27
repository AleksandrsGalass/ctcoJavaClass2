import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by alexander.galash on 6/27/2017.
 */
public class IOFacadeForTests extends IOFacade {

    private Queue<String> automated = new LinkedList<>(
            Arrays.asList(
                    "create", "Ivan Pupkin", "+3455 434",
                    "create", "John Smith", "334234234",
                    "create", "Vasilij", "3333333",
                    "list",
                    "remove", "2",
                    "list",
                    "exit"));
    @Override
    public String askString(String msg) {
        String str = automated.remove();
        System.out.println(msg + ": " + str);
        return str;
    }

    @Override
    public Integer askId(String msg) {
        String id = automated.remove();
        System.out.println(msg + ": " + id);
        return Integer.parseInt(id);
    }



}
