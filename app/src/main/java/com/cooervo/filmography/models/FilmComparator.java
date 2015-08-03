package com.cooervo.filmography.models;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film>{

    @Override
    public int compare(Film f1, Film f2) {

        if (f1.getDate().before(f2.getDate())) {
            return -1;
        } else if (f1.getDate().after(f2.getDate())) {
            return 1;
        } else {
            return 0;
        }
    }

}
