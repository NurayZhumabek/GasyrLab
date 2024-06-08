package module1.hashcodeANDequals;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundOffice {
    List<Object> things =new ArrayList<>();

    boolean  check(Object o) {
        if (o == null) return false;
        for (Object object : things) {// логика проверки вещи в списке
            if (object.equals(o))
                return  true;


        }
        return false;

    }

    void put(Object o){
        if (o!=null){
            for (Object object:things) {
                     things.add(o);
                }

            }
        }
    }


class Ball{}
class MusicalInstruments{}
class Hat{}
class Umbrella{}