package ExamPrep;

import java.util.*;

public class Coctails {

    public static final int PEAR_SOUR = 150;
    public static final int THE_HARVEST = 250;
    public static final int APPLE_HINNY = 300;
    public static final int HIGH_FASHION = 400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        ArrayDeque<Integer> ingredients = new ArrayDeque<>(); //queue
        for (String s : line)
            ingredients.offer(Integer.parseInt(s));

        line = scanner.nextLine().split(" ");
        ArrayDeque<Integer> freshness = new ArrayDeque<>(); //stack
        for (String s : line) {
            freshness.push(Integer.parseInt(s));
        }

        Map<String, Integer> cocktails = new TreeMap<>();
        cocktails.put("Pear Sour", 0);
        cocktails.put("The Harvest", 0);
        cocktails.put("Apple Hinny", 0);
        cocktails.put("High Fashion", 0);

        while(!ingredients.isEmpty() && !freshness.isEmpty()) {

            if(ingredients.peek()<=0){
                ingredients.poll();
                continue;
            }

            int currPoints = ingredients.peek() * freshness.peek();

            switch (currPoints) {
                case PEAR_SOUR:
                    cocktails.put("Pear Sour", cocktails.get("Pear Sour")+1);
                    break;
                case THE_HARVEST:
                    cocktails.put("The Harvest", cocktails.get("The Harvest")+1);
                    break;
                case APPLE_HINNY:
                    cocktails.put("Apple Hinny", cocktails.get("Apple Hinny")+1);
                    break;
                case HIGH_FASHION:
                    cocktails.put("High Fashion", cocktails.get("High Fashion")+1);
                    break;
                default:
                    int newIngredient = ingredients.peek() + 5;
                    ingredients.offer(newIngredient);
            }
            ingredients.poll();
            freshness.pop();
        }

        boolean allCoctailsMade = true;
        for(Map.Entry<String, Integer> entry : cocktails.entrySet()) {
            if (entry.getValue()==0){
                allCoctailsMade = false;
                break;
            }
        }

        if(allCoctailsMade){
            System.out.println("It's party time! The cocktails are ready!");
            for(Map.Entry<String,Integer> entry: cocktails.entrySet()){
                System.out.println("# " + entry.getKey() +  " ---> " + entry.getValue());
            }
        } else {
            int sumOfIngredients = 0;
            while (!ingredients.isEmpty()) {
                sumOfIngredients += ingredients.poll();
            }
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            System.out.println("Ingredients left: " + sumOfIngredients);
            for(Map.Entry<String,Integer> entry: cocktails.entrySet()){
                if (entry.getValue()>0)
                    System.out.println("# " + entry.getKey() +  " ---> " + entry.getValue());
            }
        }
    }
}
