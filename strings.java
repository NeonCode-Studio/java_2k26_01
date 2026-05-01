public class strings {
    public static void main(String[] args){
        String name = "Bartosz";
        boolean startswith = name.startsWith("x");
        boolean endswith = name.endsWith("z");
        int length = name.length();
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();


        System.out.println(name);
        System.out.println(length);
        System.out.println(startswith);
        System.out.println(endswith);
        System.out.println(upper);
        System.out.println(lower);

        String text = "    bardzo dlugi i skomplikowany tekst        ";
        String text2 = text.strip();
        String text3 = text2.replace(" ","_");
        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);

    }
}
