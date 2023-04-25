package org.example.miniprojects.leetcode;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
