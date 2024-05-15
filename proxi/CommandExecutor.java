public class CommandExecutor implements TerminalInterface {

    @Override
    public void execute(String command, String user) {
        System.out.println(command + " executed as " + user + " successfully");
    }

}
