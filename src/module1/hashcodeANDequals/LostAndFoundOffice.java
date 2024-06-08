package module1.hashcodeANDequals;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundOffice {
    List<Object> things =new ArrayList<>();

    boolean check(Object o) {
        if (o == null) return false;
        for (Object object : things) {
            if (object.equals(o))
                return true;
        }
        return false;
    }
    void put(Object o){
        if (o!=null){
            things.add(o);}



        }
    }


class Ball {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Ball;
    }

    @Override
    public int hashCode() {
        return 1; // or any constant value
    }
}

class MusicalInstruments {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof MusicalInstruments;
    }

    @Override
    public int hashCode() {
        return 2; // or any constant value
    }
}

class Hat {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Hat;
    }

    @Override
    public int hashCode() {
        return 3; // or any constant value
    }
}

class Umbrella {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Umbrella;
    }

    @Override
    public int hashCode() {
        return 4; // or any constant value
    }
}
