package assignment02;

public class ChatApplication {
    private static String[] censoredWords = new String[] {"idiot", "dumbass", "stupid"};

    public static String censorMethod(String chatLine) {
        for (String s : censoredWords)
            if(chatLine.contains(s)) {
                StringBuilder builder = new StringBuilder(s.length());
                for (int i = 0; i < s.length(); i++) {
                    builder.append("#");
                }
                chatLine = chatLine.replace(s, builder.toString());
            }
            return chatLine;
    }

    public static void main(String[] args) {
        System.out.println(ChatApplication.censorMethod("Hello idiot how are you. You are stupid"));
    }
}
