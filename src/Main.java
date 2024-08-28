import java.util.HashMap;
import java.util.Map;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String apiUrl = "https://some.website.com/api.php";

        Map<String, String> params = new HashMap<>();
        params.put("firstname", "TestFirstName");
        params.put("lastname", "TestLastName");
        params.put("email", "email@test.com");
        params.put("address", "Gargždai, Gargždų raj., Alyvų 1234 k., Vienkiemio g. 1");
        params.put("city", "Gargždai");
        params.put("postcode", "01234");
        params.put("country", "LT");

        StringBuilder urlQuery = new StringBuilder();
        boolean firstParam = true;

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String encodedValue = URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8);

            if (firstParam) {
                urlQuery.append("?").append(entry.getKey()).append("=").append(encodedValue);
                firstParam = false;
                continue;
            }

            urlQuery.append("&").append(entry.getKey()).append("=").append(encodedValue);
        }

        String resultUrl = apiUrl + urlQuery;

        System.out.println(resultUrl);
    }
}