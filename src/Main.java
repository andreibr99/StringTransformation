public class Main {
    public static void main(String[] args) {
        StringTransformation example = new StringTransformation();
        String string = "full_name, email, location\n" +
                "Anita, anita@email.com, California\n" +
                "Aron, aron.bla@email.com, California\n" +
                "Aron, aron.bla@email.com, California\n" +
                "Cosmin, kox@bla.com, Giurgiu\n" +
                "Crina, ggl@test.com, Letcani\n" +
                "Bogdan, vox@example.com, Resita";
        example.stringTransformation(string);
    }
}