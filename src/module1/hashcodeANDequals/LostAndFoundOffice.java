package module1.hashcodeANDequals;

import java.util.List;

public class LostAndFoundOffice {
    List<Object> things;

    boolean  check(Object o) {
        if (o == null) return false;
        boolean answer=false;
        for (Object object : things) {// логика проверки вещи в списке
            if (object.equals(o))
                answer= true;


        }
        return answer;

    }

    void put(Object o){
        if (o!=null){
            for (Object object:things) {
                if (!object.equals(o)){
                     things.add(o);
                }

            }
        }
    }

}
class Ball{}
class MusicalInstruments{}
class Hat{}
class Umbrella{}