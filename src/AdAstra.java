import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([|#])(?<item>[a-zA-z\\s]+)\\1(?<date>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<Product> foods = new LinkedList<>();

        while (matcher.find()) {
            String productName = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            Product food = new Product(productName, date, calories);
            foods.add(food);
        }
        int days = foods.stream().mapToInt(Product::getCalories).sum() / 2000;
        System.out.printf("You have food to last you for: %d days!\n", days);
        foods.forEach(System.out::println);

        }
    }

    class Product {
        String name;
        String expireDate;
        int calories;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getExpireDate() {
            return expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public Product(String name, String expireDate, int calories) {
            this.name = name;
            this.expireDate = expireDate;
            this.calories = calories;
        }
        @Override
        public String toString(){
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.name, this.expireDate, this.calories);
        }
    }
