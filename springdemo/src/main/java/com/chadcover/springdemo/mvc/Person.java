package com.chadcover.springdemo.mvc;

public class Person {
    private String firstName;
    private String lastName;
    private String footballTeam;
    // private LinkedHashMap<String, String> footballTeamsMap;
    private String favoriteLanguage;

    private String[] operatingSystems;

    public Person() {
//        footballTeamsMap = new LinkedHashMap<>();
//        footballTeamsMap.put("Ravens", "Baltimore Ravens");
//        footballTeamsMap.put("Bengals", "Cincinnati Bengals");
//        footballTeamsMap.put("Browns", "Cleveland Browns");
//        footballTeamsMap.put("Steelers", "Pittsburgh Steelers");
//        footballTeamsMap.put("Packers", "Green Bay Packers");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFootballTeam() {
      return footballTeam;
    }

    public void setFootballTeam(String footballTeam) {
        this.footballTeam = footballTeam;
    }

//    public LinkedHashMap<String, String> getFootballTeamsMap() {
//        return footballTeamsMap;
//    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
