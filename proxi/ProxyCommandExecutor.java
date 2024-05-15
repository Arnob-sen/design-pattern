import java.util.ArrayList;
import java.util.List;

public class ProxyCommandExecutor implements TerminalInterface {
    private CommandExecutor commandExecutor;
    private List<String> restrictedCommands;

    public ProxyCommandExecutor() {
        commandExecutor = new CommandExecutor();
        restrictedCommands = new ArrayList<>();
        restrictedCommands.add("rm -rf");
    }

    @Override
    public void execute(String command, String user) {
        if (restrictedCommands.contains(command) && !user.equals("admin")) {
            System.out.println("Can't execute command: " + command);
        } else {
            commandExecutor.execute(command, user);
        }
    }
}
