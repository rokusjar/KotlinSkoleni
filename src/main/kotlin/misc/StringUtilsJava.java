package misc;

public class StringUtilsJava {

    public static void main(String[] args) {
        System.out.println(new StringUtils().getFirstWord("Whatever you want"));
        // TODO 1
        System.out.println("1 " + StringUtils1.INSTANCE.getFirstWord("Whatever you want"));
        // TODO 2
        System.out.println("2 " + Utils.getFirstWord2("Whatever you want"));
        // TODO 3
        System.out.println("3 " + Utils.firstWord3("Whatever you want", " "));
        // TODO 4
        System.out.println("4 " + Utils.firstWord4("Whatever you want", " "));
        // TODO 5
        System.out.println("5 " + Utils.firstWord5("Whatever you want", " "));
        // TODO 6
        System.out.println("6 " + Utils.firstWord6("Whatever you want", " "));
        // TODO 7
        System.out.println("7 " + Utils.getFirstWord7("Whatever you want"));
    }
}
