package com.icbt.web.demo.web_app_demo.model;

/**
 * @author Tharindu Eranga
 * @date Tue 29 Dec 2020
 */
public class CustomerDTO {

    private String id;
    private String name;
    private String tel;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
