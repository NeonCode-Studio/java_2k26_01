public class operatoryLogiczne {
    public static void main(String[] args) {
        String name = "neon";

        System.out.println(name.startsWith("n") || name.endsWith("z"));

        int a = 5;
        int b = 10;

        System.out.println(a < b && b < 15 && a < 7);
    }
}
