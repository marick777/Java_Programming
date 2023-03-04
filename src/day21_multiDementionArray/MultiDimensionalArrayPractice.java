package day21_multiDementionArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Vitea", "Grisha", "James", "Jack"};
        String[] group2 = {"Vasea", "Steopa", "Marian"};
        String[] group3 = {"Vika", "Sasha", "Misha", "Iuri", "Kim"};
        String[] group4 = {"Vova", "Katea"};

        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] each_Group = groups[i];
            System.out.println(Arrays.toString(each_Group));

            for (int j = 0; j < each_Group.length; j++) {
                String each_name = each_Group[j];
                System.out.println(each_name);
            }
        }

        System.out.println("----------------------------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }
        }

        System.out.println("----------------------------------------------------------------------");


        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------------------------------------");

        System.out.println(Arrays.deepToString(groups));




    }
}
