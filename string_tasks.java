public class string_tasks {
    public static void main(String[] args){
        String name = "  Jak nauczyć się programownia  ";
        System.out.println(name);

        String name2 = name.strip();
        System.out.println(name2);
        String name3 = name2.toUpperCase();
        System.out.println(name3);
        String name4 = name3.substring(4);
        System.out.println(name4);

        name = name.strip().toUpperCase().substring(4);
        System.out.println(name);
        
        System.out.println("hello,neoncode");

    }
}
