package com.juhnowski.hdrs;

import java.util.List;

public class Hdrs {
    List<Integer> w;

    public Hdrs(List<Integer> w){
        this.w = w;
    }

    private String onestep(int x){
        if (x>23) {
            return "Депрессивное расстройство крайне тяжелой степени";
        }

        if (x>19) {
            return "Депрессивное расстройство тяжелой степени";
        }

        if (x>14) {
            return "Депрессивное расстройство средней степени тяжести";
        }

        if (x>8) {
            return "Легкое депрессивное расстройство";
        }

        return "Норма";
    }

    public String summator(List<String> x){
        int res=0;
        for (int i=0; i<17; i++){
            res += w.get(i)*Integer.parseInt(x.get(i));
        }
        return onestep(res);
    }
}
