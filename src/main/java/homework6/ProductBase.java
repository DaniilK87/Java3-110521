package homework6;

import java.util.*;

public class ProductBase {

    HashMap<String, Product> hashMap = new HashMap<>();
    List<String> listKey;


    private HashMap<String, Product> productBase() {
        hashMap.put("101", new Product("Яблоко",50));
        hashMap.put("202", new Product("Курица",6));
        hashMap.put("303", new Product("Тунец",2));
        hashMap.put("404", new Product("Помидоры",100));
        hashMap.put("505", new Product("Хлеб",1));
        return hashMap;
    }

    public HashMap<String, Product> getProductBase() {
        hashMap = new HashMap<>(productBase());
        Set<Map.Entry<String, Product>> entries = hashMap.entrySet();
        for (Map.Entry<String, Product> entry: entries){
            if (entry.getValue().getCount() > 5) {
                System.out.println(entry.getKey());
            }
        }
        getProductBase(hashMap,listKey);
        return hashMap;
    }


    private void getProductBase(HashMap<String, Product> hashMap, List<String> listKey) {
        hashMap = new HashMap<>(productBase());
        listKey = new ArrayList<>(hashMap.keySet());

            Set<Map.Entry<String, Product>> entries = hashMap.entrySet();
            for (Map.Entry<String, Product> entry: entries){
                for (String key: listKey) {
                    hashMap.put(key, entry.setValue(new Product(entry.getValue().getProductName(),entry
                            .getValue().getCount() + 10)));
                    break;
                }
            }
        System.out.println(hashMap);
    }
}

//вот задача. Создать HashMap и забить туда данные.
// Пусть будет продуктовый склад у нас. и Ключ - id продукта, а значение Сам Продукт.
// У продукта будут следующие поля. Имя. Производитель. Количество на складе.
//Создай 5-10 продуктов и забей ими HashMap далее.
//Выведи на экран все ключи продуктов, чье количество больше 5 на складе
// 2) Групповое изменение. Создай метод, который принимает на вход
// а) Хешмепу с  Ключом - id продукта, а значение Сам Продукт, вторым параметром метод принимает список ключей
//Тебе надо у продуктов входящий в этих список в этой поданной хешмепе увеличить их количество на складе на 10 единиц
