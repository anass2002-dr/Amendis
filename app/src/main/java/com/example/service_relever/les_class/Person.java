package com.example.service_relever.les_class;

public class Person {

    private String email;
    private String password;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person() {
    }

    public Person(String email, String password) {

        this.email = email;
        this.password = password;
    }
}
