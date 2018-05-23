package ch16;

/*
Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
[1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40],the call of list.countDuplicates() should return 7 because there are
2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23, and 1 duplicate of 40.
 */

public class opg5
{
    public static void main(String[] args) {

        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(3);
        liste.add(6);
        liste.add(9);
        liste.add(15);
        liste.add(15);
        liste.add(23);
        liste.add(23);
        liste.add(23);
        liste.add(40);
        liste.add(40);
        liste.countDuplicates();

    }
}
