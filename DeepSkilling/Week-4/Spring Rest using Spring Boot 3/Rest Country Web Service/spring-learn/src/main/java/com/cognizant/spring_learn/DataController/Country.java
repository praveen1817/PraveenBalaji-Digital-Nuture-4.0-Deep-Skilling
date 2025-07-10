package com.cognizant.spring_learn.DataController;

public class Country {
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String code;
    public Country(String name,String code){
        this.name=name;
        this.code=code;
    }
    @Override
    public String toString(){
        return " Country : "+name+" Code :"+code;
    }
}
