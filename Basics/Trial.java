public class Trial {
    public static void main(String[] args) {
        String string = "Naman";
        StringBuffer name = new StringBuffer("Amit");
        name.append("Sharma");
        System.out.println(name.capacity());
        System.out.println(name);
        string = string + "Dubey";
        System.out.println(string.hashCode());
        System.out.println( "Hello "+string);
        System.out.println(string.charAt(1) == string.charAt(3));
    }
}



