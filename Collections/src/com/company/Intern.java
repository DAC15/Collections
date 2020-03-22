package com.company;

public class Intern implements Comparable<Intern>{
    int Id;
    String name;
    String stream;

    public Intern(int id, String name, String stream) {
        Id = id;
        this.name = name;
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                '}';
    }

    @Override
    public int compareTo(Intern o) {
        int compare = this.name.compareTo(o.name);
        if(compare < 0) return -1; // this name is bigger
        if(compare > 0) return 1; // this name is smaller
        return 0; // equal
    }
}
