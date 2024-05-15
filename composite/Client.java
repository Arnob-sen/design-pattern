public class Client {
    public static void main(String[] args) {
        Document doc1 = new Document(18);
        Document doc2 = new Document(76);
        Document doc3 = new Document(78);

        Folder subFolder = new Folder();
        Folder mainFolder = new Folder();

        mainFolder.add(subFolder);
        mainFolder.add(doc1);
        mainFolder.add(doc2);
        subFolder.add(doc3);

        System.out.println(mainFolder.getSize());
    }
}
