package com.strategy;

import java.util.List;

public class Enviroment {
    private SortInterface sortInterface;

    public Enviroment(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public SortInterface getSortInterface() {
        return sortInterface;
    }

    public void setSortInterface(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public void sort(List<Person> list){
        this.sortInterface.sort(list);
    }
}
