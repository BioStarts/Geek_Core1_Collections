import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("-----Задание№ 1----");

        ArrayList<String> words= new ArrayList<>();
        for (int i =0 ; i < 10 ; i++){
            words.add(i + " word");
        }
        words.add(1,"0 word");
        words.add(1,"0 word");
        words.add(5,"4 word");
        System.out.println(words);
        Set<String> set = new HashSet<>(words); //создаем и печатаем набор уникальных значений из нашего ArrayList
        System.out.println(set);
        //--------Количество повторений:
        String o;
        System.out.println("-----Задание№ 1.2 первый способ----");//можно через Map каждый раз когда встречается слово добавлять в строку, например +1
        Map <String, Integer> books = new HashMap<>();
        for (int i = 0; i < words.size(); i++){
            o = words.get(i);
            //books.compute(o, (a, b) -> b + " 1+");
            books.compute(o, (a, b) -> b == null ? 1 : ++b);
        }
        books.forEach((a,b) -> System.out.println(a +" встречается "+ b +" "));
        System.out.println("-----Задание№ 1.2 второй способ----");//перебираем в цикле
        int x;
        for (int i = 0; i < words.size(); i++){
            x = 1;
            o = words.get(i);
            //for (int j = 0; j < words.size(); j++){
            for (int j = words.size() - 1; j > i ; j--){
                if (o.equals(words.get(j))){
                    words.remove(j);
                    x++;
                }
            }
            System.out.println("элемент " + o +" встречается " + x + " раз(а)");
        }
        System.out.println("-----Задание№ 2----");

        PhoneBook book = new PhoneBook();
        book.add("Сидорова","1234");
        book.add("Сидорова","234");
        book.add("Иванов","123");
        book.add("Кузнецов","567");
        book.get("Сидорова");
        book.get("Иванов");
    }
}

