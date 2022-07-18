package homework6;

import java.util.Objects;

public class Product {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return count == product.count && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, count);
    }

    public String getProductName() {
        return productName;
    }

    private String productName;

    public int getCount() {
        return count;
    }

    private int count;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", count=" + count +
                '}';
    }

    public Product(String productName, int count) {
        this.productName = productName;
        this.count = count;
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
