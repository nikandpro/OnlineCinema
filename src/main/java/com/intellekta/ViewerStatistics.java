package com.intellekta;

import java.util.ArrayList;

public class ViewerStatistics {

    public static int averageAge(ArrayList<Viewer> viewers) {
        int sum=0;
        for (int i=0; i<viewers.size(); i++) {
            sum += viewers.get(i).getAge();
        }
        if (sum!=0) return sum/viewers.size();
        else return 0;
    }
}
