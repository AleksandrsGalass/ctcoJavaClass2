import java.util.Scanner;

/**
 * Created by alexander.galash on 6/26/2017.
 */
public class IOFacade {

    private static final IOFacade INSTANCE = new IOFacadeForTests();
    private Scanner scanner = new Scanner(System.in);

    protected IOFacade() {
    }

    public static IOFacade getInstance() {
        return INSTANCE;
    }

    public  String askString( String msg) {
        System.out.println(msg + ": ");
        return scanner.nextLine();
    }
    public Integer askId (String msg) {
        System.out.println(msg + ": ");
        return Integer.parseInt(scanner.nextLine());
    }
}
