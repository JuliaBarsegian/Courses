package HW_15_11_19.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String key = "кактус";
        Map<String, String> typesOfPlants = new HashMap<>();
        typesOfPlants.put("арбуз", "ягода");
        typesOfPlants.put("дуб", "дерево");
        typesOfPlants.put("кактус", "цветок");
        typesOfPlants.put("малина", "ягода");
        AllTypes(typesOfPlants);
        ParticularType(typesOfPlants, key);
    }

    public static void AllTypes(Map<String, String> typesOfPlants) {
        for (Map.Entry<String, String> item : typesOfPlants.entrySet()) {
            System.out.printf("Ключ: %s / Значение: %s \n", item.getKey(), item.getValue());
        }
    }

    public static void ParticularType(Map<String, String> typesOfPlants, String key) {
        System.out.printf("Ключ: %s / Значение: %s \n", key, typesOfPlants.get(key));
    }
}

