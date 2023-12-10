package gusev.java23.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LovedThings {
    // ключ - имя, значение - массив любимых вещей
    private Map<String, String[]> info = new HashMap<String, String[]>();
    //ключ - вещь, значение - сколько раз ее записали в любимые
    private Map<String, Integer> allThings = new HashMap<String, Integer>();

    public Map<String, String[]> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String[]> info) {
        this.info = info;
    }

    public Map<String, Integer> getAllThings() {
        return allThings;
    }

    public void setAllThings(Map<String, Integer> allThings) {
        this.allThings = allThings;
    }

    public void addInfo(String newInfo) {
        String[] temp = newInfo.split(" *: *");
        String[] lovedThings = temp[1].split(" *, *");
        for (int i = 0; i < lovedThings.length; i++) {
            if (allThings.keySet().contains(lovedThings[i]))
                allThings.replace(lovedThings[i], allThings.get(lovedThings[i]) + 1);
            else
                allThings.put(lovedThings[i], 1);
        }
        if (info.keySet().contains(temp[0])) {
            for (String key : info.get(temp[0])) {
                allThings.replace(key, allThings.get(key) - 1);
            }
            info.replace(temp[0], lovedThings);
        } else {
            info.put(temp[0], lovedThings);
        }
    }

    public void print() {
        for (String key : info.keySet()) {
            System.out.println("Ключ " + key);
            for (int i = 0; i < info.get(key).length; i++) {
                System.out.print(info.get(key)[i] + " ");
            }
            System.out.println(" ");
        }
    }

    public Set<String> findThingsAllLove() {
        Set<String> answer = new HashSet<String>();
        for (String key : info.keySet()) {
            if (answer.isEmpty()) {
                for (int i = 0; i < info.get(key).length; i++) {
                    answer.add(info.get(key)[i]);
                }
            } else {
                Set<String> temp = new HashSet<String>();
                for (int i = 0; i < info.get(key).length; i++) {
                    temp.add(info.get(key)[i]);
                }
                answer.retainAll(temp);
            }
        }
        return answer;
    }

    public Set<String> findAll() {
        Set<String> answer = new HashSet<String>();
        for (String key : info.keySet()) {
            for (int i = 0; i < info.get(key).length; i++) {
                answer.add(info.get(key)[i]);
                answer.retainAll(answer);
            }
        }
        return answer;
    }

    public Set<String> personalPreferences(String key) {
        Set<String> answer = new HashSet<String>();
        for (int i = 0; i < info.get(key).length; i++)
            answer.add(info.get(key)[i]);
        for (String name : info.keySet()) {
            if (!name.equals(key)) {
                for (int i = 0; i < info.get(name).length; i++) {
                    if (answer.contains(info.get(name)[i]))
                        answer.remove(info.get(name)[i]);
                }
            }
        }
        return answer;
    }

    public Integer countOfThing(String key) {
        if (allThings.get(key) == 0)
            allThings.remove(key);
        return allThings.get(key);
    }
}
