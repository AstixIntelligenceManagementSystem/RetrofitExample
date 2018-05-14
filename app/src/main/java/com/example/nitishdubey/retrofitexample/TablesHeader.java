package com.example.nitishdubey.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Nitish Dubey on 09-05-2018.
 */

public class TablesHeader {

    @SerializedName("tblCategory")
    List<CategoryMaster> listCatgry;

    public List<CategoryMaster> getListCatgry() {
        return listCatgry;
    }

    public void setListCatgry(List<CategoryMaster> listCatgry) {
        this.listCatgry = listCatgry;
    }
}
