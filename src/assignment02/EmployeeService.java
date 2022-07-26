package assignment02;

import java.util.HashMap;

public class EmployeeService {

    private static String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
    private static HashMap<String, String> cityCodes = new HashMap<String, String>() {{
        put("011", "Delhi");
        put("022", "Mumbai");
        put("080", "Banglore");
        put("020", "Pune");
    }};
    /*
     * Note : employee codes are designed in following way:
     * a) first 3 digits are employee code
     * b) next 3 digits are related to their department id.
     * c) and last 3 digits are the city code of their work location
     *     for example
     *       011 : Delhi
     *       022 : Mumbai
     *       080 : Banglore
     *       020 : Pune
     * */

    public static void getEmployeeCodes()
    {
        System.out.println("Employee code : City code");
        for (String empid : employees) {
            String employeeCode = empid.substring(0, 3);
            String cityCode = empid.substring(empid.length() - 3);
            System.out.println(employeeCode + " : " + cityCodes.get(cityCode));
        }
    }

    public static void main(String[] args) {
        EmployeeService.getEmployeeCodes();
    }
}
