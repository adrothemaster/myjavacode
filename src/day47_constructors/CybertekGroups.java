package day47_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");
        System.out.println(group1.getMembers().size());
        group1.addMember("adrien");
        group1.addMember("maria");
        group1.addMember("murodil");
        group1.addMember("basil");
        group1.addMember("andrey");
        group1.addMember("sarah");
        group1.addMember("mesut");

        System.out.println(group1.getMembers().size());
        System.out.println(group1);

        Group group2 = new Group("CyberCuts");
        group2.setMembers(Arrays.asList("Steven", "Wakshum", "Akrem", "Andrea", "Andrey", "Bulent"));

        System.out.println("group2 members = " + group2.getMembers());
        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of group 2");
        }else{
            System.out.println("Akrem is not in group");
        }
        group1.removeMember("murodil");
        group1.removeMember("mesut");

        System.out.println(group1);

    }
}
