package day12;

import java.util.Arrays;
import java.util.Comparator;

public class AgeSort implements PersonSort{


    @Override
    public void Sort(Person[] people, boolean Flag) {
        if (Flag){

            Arrays.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getAge()-o2.getAge();
                }
            });

        }
        else {
            Arrays.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o2.getAge()-o1.getAge();
                }
            });
        }
    }
}
