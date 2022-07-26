package assignment02;


import java.util.HashMap;

public class EmailFilters {
    static String emails[] = {
            "ramesh@gmail.com",
            "rakesh@outlook.com",
            "lokesh@linkedin.com",
            "mahesh@gmail.com",
            "ganesh@gmail.com",
            "rajesh@outlook.com"
    };
    public static void main(String[] args) {
        /*
         * Write the code to count the number of users in particular 			domain
         * for example
         * gmail has 3 users
         * outlook has 2 users
         * linkedin has 1 user
         *
         * HINT : use endsWith() of String class
         * */
        EmailFilters.countNumberOfUsers();
    }

    public static void countNumberOfUsers() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String e: emails) {
            String emailType = e.split("@")[1];
            hashMap.computeIfAbsent(emailType, key->0);
            hashMap.computeIfPresent(emailType, (key, value) -> value+1);
        }
        System.out.println(hashMap);
    }
}
