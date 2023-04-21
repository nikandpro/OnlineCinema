package com.intellekta;

import java.util.ArrayList;
import java.util.Random;

public class CinemaApplicationRun {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Viewer> viewers = new ArrayList<Viewer>();
        for (int i=0; i<5; i++) {
            viewers.add(new Viewer("viewer"+i,rd.nextInt(50),rd.nextInt(20)));
        }
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
