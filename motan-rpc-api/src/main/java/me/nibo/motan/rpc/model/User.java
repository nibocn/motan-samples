package me.nibo.motan.rpc.model;

import java.io.Serializable;
import java.util.List;

/**
 * 用户
 * @author NiBo
 */
public class User implements Serializable {
    private String id;
    private int age;
    private List<String> hobbies;
    private boolean gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
