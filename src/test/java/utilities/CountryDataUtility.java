package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Utility class for working with JSON data representing countries and pricing.
 */
public class CountryDataUtility {

    // JSON key constants
    private static final String KEY_NAME = "name";
    private static final String KEY_CURRENCY = "currency";
    private static final String KEY_TYPE = "type";
    private static final String KEY_PRICE = "price";
    private static final String KEY_PRICES = "prices";

    /**
     * Gets country data for a specific country.
     *
     * @param countryName The name of the country to retrieve data for.
     * @param countries   The list of countries and their data.
     * @return The country data as a map, or null if not found.
     */
    public static Map<String, Object> getCountryData(String countryName, List<Map<String, Object>> countries) {
        for (Map<String, Object> country : countries) {
            if (country.get(KEY_NAME).equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    /**
     * Gets the currency for a specific country's data.
     *
     * @param countryData The data for a specific country.
     * @return The currency as a string.
     */
    public static String getCurrency(Map<String, Object> countryData) {
        return (String) countryData.get(KEY_CURRENCY);
    }

    /**
     * Gets the price for a specific type in a given country's data.
     *
     * @param countryName The name of the country to retrieve data for.
     * @param type        The type for which to retrieve the price.
     * @param countries   The list of countries and their data.
     * @return The price as a double, or null if not found.
     */
    public static Double getPriceForType(String countryName, String type, List<Map<String, Object>> countries) {
        Map<String, Object> countryData = getCountryData(countryName, countries);
        if (countryData == null) {
            return null;
        }
        List<Map<String, Object>> prices = (List<Map<String, Object>>) countryData.get(KEY_PRICES);
        for (Map<String, Object> price : prices) {
            if (price.get(KEY_TYPE).equals(type)) {
                return (Double) price.get(KEY_PRICE);
            }
        }
        return null;
    }


    public static List<Map<String, Object>> pricesList(String countryName, List<Map<String, Object>> countries) {
        List<Map<String, Object>> prices =
                (List<Map<String, Object>>) getCountryData(countryName, countries).get(KEY_PRICES);
        return prices;
    }

    public static String getType(Map<String, Object> price) {

        return (String) price.get(KEY_TYPE);
    }


    public static void main(String[] args) throws Exception {
        List<Map<String, Object>> countries = JsonReader.readJsonData(
                System.getProperty("user.dir") + "/src/main/resources/testData.json", "countries");


        Map<String, Object> countryData = getCountryData("BR", countries);

        String currency = getCurrency(countryData);

        double price = getPriceForType("BR", "LITE", countries);


        String type = CountryDataUtility.getType(pricesList("BR", countries).get(0));


        System.out.println("11" + countries);

        System.out.println("22" + countryData);


        System.out.println("33" + currency);

        System.out.println("44" + type);

        System.out.println("55" + price);


    }
}
