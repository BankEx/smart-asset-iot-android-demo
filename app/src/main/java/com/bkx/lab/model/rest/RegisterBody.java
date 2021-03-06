package com.bkx.lab.model.rest;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class RegisterBody {

    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;

    @Override
    public String toString() {
        return "{\"RegisterBody\":{"
                + "\"id\":\"" + id + "\""
                + ", \"name\":\"" + name + "\""
                + "}}";
    }
}
