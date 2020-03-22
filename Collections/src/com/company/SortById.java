package com.company;

import java.util.Comparator;

public class SortById implements Comparator<Intern> {
    @Override
    public int compare(Intern intern1, Intern intern2) {
        return intern1.Id - intern2.Id;
    }
}
