package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List arrayList1 = new ArrayList<>();
        List arrayList2 = new ArrayList<>();

        arrayList1.add("Sergio");
        arrayList1.add("Corona");
        arrayList1.add("Virus");
        arrayList1.add(1);
        arrayList1.add(32);

        arrayList2.add("Sergio");
        arrayList2.add("Corona");
        arrayList2.add("Virus");
        arrayList2.add(Math.PI);
        arrayList2.add(Math.E);

        List noDuplicates = new ArrayList<>(arrayList2);
        noDuplicates.removeAll(arrayList1);
        noDuplicates.addAll(arrayList1);
        System.out.println("List with no duplications " + noDuplicates);


        Intern intern1 = new Intern(131, "Dacian", "Java");
        Intern intern2 = new Intern(322, "Vasile", "Devops");
        Intern intern3 = new Intern(99, "Valeria", "Analyst");
        ArrayList<Intern> interns = new ArrayList<>();
        interns.add(intern1);
        interns.add(intern2);
        interns.add(intern3);
        Collections.sort(interns, new SortById());
        System.out.println("Sorted by Id");
        for (int i = 0; i < interns.size(); i++) {
            System.out.println(interns.get(i));
        }
        System.out.println("Sorted by name");
        Collections.sort(interns);
        for (int i = 0; i < interns.size(); i++) {
            System.out.println(interns.get(i));
        }
    }
}
