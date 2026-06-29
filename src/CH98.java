// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Create a Map where the keys are country names
//                      (as String) and the values are their capitals
//                      (also String). Populate the map with at least
//                      five countries and their capitals. Write a
//                      program that prompts the user to enter a country
//                      name and then displays the corresponding capital,
//                      if it exists in the map.
//  Function name :     capitalFinder using map
//  Input :             Map<String,String>
//  Output :            String
//  Description :       Store Country and their capital names in a map
//                      as key value pair and return the capital if user
//                      asks it for any country.
//  Date :              30/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

import utils.ArrayUtility;
import java.util.HashMap;
import java.util.Map;

class CountryMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("China", "Beijing");
        map.put("Pakistan", "Islamabad");
        map.put("Srilanka", "Colombo");
        map.put("Bangladesh", "Dhaka");

        capitalFinder(map);

    }
    public static void capitalFinder(Map<String,String> map){
        System.out.println("Welcome to capital finder ");
        System.out.print("Enter country name : ");
        String country = ArrayUtility.sc.next();

        country = country.substring(0,1).toUpperCase() +
                country.substring(1).toLowerCase();

        if(map.containsKey(country)){
            System.out.printf("\nCapital of %s is %s\n",country, map.get(country));
        }
        else{
            System.out.println("Sorry data not available..");
        }
    }
}
