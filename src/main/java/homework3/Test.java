package homework3;

public class Test {

    public void experimentText(String text) {
        char lastChar = text.charAt(13);
        System.out.println(lastChar);

        if (text.endsWith("!!!")) {
            System.out.println("Строка заканчивается построкой !!!");
        }

        if (text.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки I like");
        }

        if (text.contains("Java")) {
            System.out.println("Строка содержит подстроку Java");
        }

        System.out.println("Позиция подстроки Java в строке" + " " + text + ": " + text.indexOf("Java"));
        System.out.println(text.replace("a","o"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String[] aText = text.split("\\s+");
        System.out.println(aText[2]);

    }

}

//a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
// В этом методе по очереди сделать следующее с этой строкой:
//б) Распечатать последний символ строки.
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”.
//г) Проверить, начинается ли ваша строка подстрокой “I like”.
//д) Проверить, содержит ли ваша строка подстроку “Java”.
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//ж) Заменить все символы “а” на “о”.
//з) Преобразуйте строку к верхнему регистру.
//и) Преобразуйте строку к нижнему регистру.
//к) В самом конце. Вывести на экран последнее слово строк
