/**
 * Created by alexander.galash on 6/26/2017.
 */
public class Main {

    private static IOFacade io = IOFacade.getInstance();
    private static Notebook notebook = new Notebook();

    public static void main(String[] args) {
        while (true) {
            String input = io.askString("Command");
            switch (input) {
                case "help":
                    help();
                    break;
                case "list":
                    list();
                    break;
                case "create":
                    create();
                    break;
                case "remove":
                    delete();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown");

            }
        }
    }

    private static void help() {
        System.out.println("help - get list of commands");
        System.out.println("create - create new record");
        System.out.println("list - show contacts");
        System.out.println("remove - remove a record by ID");
        System.out.println("exit - exit program");
    }

    private static void list() {
        if (notebook.getList().size() > 0) {
        for (Record r : notebook.getList()) {
            System.out.println(r);
        }
        }else System.out.println("\tlist is empty at the moment");
    }

    private static void create() {
        String name = io.askString("name");
        String phone = io.askString("phone");
        Record record = new Record();
        record.setFullName(name);
        record.setPhone(phone);
        notebook.add(record);
        System.out.println("Record" + record.toString() + "created");
    }

    private static int delete() {
        int id = io.askId("ID of record to be deleted");
        notebook.remove(id);
        return id;
    }
}

