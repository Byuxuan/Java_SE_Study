package day12;

public class NamaSort implements PersonSort{
    public  void Swap(Person[] people, int a, int b){
        Person temp;
        temp=people[a];
        people[a]=people[b];
        people[b]=temp;
    }
    @Override
    public void Sort(Person[] people, boolean Flag) {
          if(Flag){

              for (int i = 0; i <people.length ; i++) {
                  int min=i;
                  for (int j = i+1; j <people.length ; j++) {
                      if (people[j].getName().compareTo(people[min].getName())<0) {
                          min=j;
                      }
                  }
                  Swap(people,i,min);

              }
          }
          else {

              for (int i = 0; i <people.length ; i++) {
                  int max=i;
                  for (int j = i+1; j <people.length ; j++) {
                      if (people[j].getName().compareTo(people[max].getName())>0) {
                          max=j;
                      }
                  }
                  Swap(people,i,max);

              }

          }
    }

}
