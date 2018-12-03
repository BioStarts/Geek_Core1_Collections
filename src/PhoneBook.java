import java.util.HashMap;

public class PhoneBook {

    private HashMap<String,String> phonelist;

    public PhoneBook() {
        phonelist = new HashMap<> ();
    }

    public void add(String family,String phone){
        if (phonelist.containsKey(family)){
            phone ="\n" + phonelist.get(family) + "\n" + phone; //перенос строки для того чтобы в консоли читалось лучше
            phonelist.replace(family,phone);
            //phonelist.compute(key,(a,b) -> b+ "value");// не разобрался, а чувствую что можно было бы использовать
        } phonelist.put(family,phone);
    }
    public void get(String family) {
        System.out.println("По фамилии " + family + " найдены следующие номера телефонов : "
                + phonelist.getOrDefault(family,"Отсутсвует в справочнике"));
    }
}
