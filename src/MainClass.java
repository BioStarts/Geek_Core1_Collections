import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("-----Задание№ 1----");

        ArrayList<String> worlds= new ArrayList<>();
        for (int i =0 ; i < 10 ; i++){
            worlds.add(i + " world");
        }
        worlds.add(1,"0 world");
        worlds.add(5,"4 world");
        Set<String> set=new LinkedHashSet<>(worlds);
        System.out.println(set);

        System.out.println("-----Задание№ 2----");

        HashMap<String,String> MobList = new HashMap<>();
        MobList.put("Иванов","123");
        MobList.put("Петров","234");
        MobList.put("Сидорова", "345");
        MobList.getOrDefault("Кузьмина","222");
        //System.out.println(MobList);
        //System.out.println(MobList.getOrDefault("Liza","222"));
        add(MobList,"Сидорова","1234");
        get(MobList,"Сидорова");
        get(MobList,"Трамп");
        add(MobList,"Кузнецов","567");
        get(MobList,"Кузнецов");
    }
    public static void add (HashMap phonelist,String key, String value){
        if (phonelist.containsKey(key)){
            value ="\n" + phonelist.get(key) + "\n" + value; //перенос строки для того чтобы в консоли читалось лучше
            //phonelist.put(key,value);
            phonelist.replace(key,value);
        } phonelist.put(key,value);
    }
    public static void get (HashMap phonelist,String key) {
        System.out.println("По фамилии " + key + " найдены следующие номера телефонов : "
                + phonelist.getOrDefault(key,"Отсутсвует в справочнике"));
    }
}

