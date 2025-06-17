//package strings;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class BitcoinRate {
//    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//            JSONObject json = new JSONObject(response.toString());
//            String rate = json.getJSONObject("bpi").getJSONObject("USD").getString("rate");
//
//            String rateInWords = convertToWords(rate);
//
//            System.out.println(rateInWords);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String convertToWords(String rate) {
//        String[] parts = rate.split("\\.");
//        String integerPart = parts[0].replace(",", "");
//
//        int num = Integer.parseInt(integerPart);
//
//        String[] units = {
//            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
//            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
//        };
//        String[] tens = {
//            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
//        };
//
//        StringBuilder words = new StringBuilder();
//
//        if (num == 0) {
//            words.append("Zero");
//        } else if (num < 20) {
//            words.append(units[num]);
//        } else if (num < 100) {
//            words.append(tens[num / 10]);
//            if (num % 10 != 0) {
//                words.append(" ").append(units[num % 10]);
//            }
//        } else {
//            words.append("Number out of range");
//        }
//
//        return words.toString();
//    }
//}
