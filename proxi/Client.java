public class Client {
    public static void main(String[] args) {

        ProxyCommandExecutor proxyCommandExecutor = new ProxyCommandExecutor();
        proxyCommandExecutor.execute("mkdir design pattern", "user");
        proxyCommandExecutor.execute("rm -rf", "user");
        proxyCommandExecutor.execute("rm -rf", "admin");
        
    }
}
