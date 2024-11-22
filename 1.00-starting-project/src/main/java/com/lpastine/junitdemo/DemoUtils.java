package com.lpastine.junitdemo;

import java.util.List;

public class DemoUtils {

    private String academy = "Luv2Code Academy";
    private String academyDuplicate = academy;

    private String[] firstThreeLettersOfAlphabet = {"A", "B", "C"};
    private List<String> academyInList = List.of("luv", "2", "code");

    public int add(int a, int b) {
        return a + b;
    }

    public Object checkNull(Object obj) {
        return obj;
    }

    public Boolean isGreater(int n1, int n2) {
        return n1 > n2;
    }

    public String getAcademy() {
        return academy;
    }

    public String getAcademyDuplicate() {
        return academyDuplicate;
    }

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public List<String> getAcademyInList() {
        return academyInList;
    }
}
