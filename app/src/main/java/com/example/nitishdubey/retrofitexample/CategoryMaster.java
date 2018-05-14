package com.example.nitishdubey.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nitish Dubey on 09-05-2018.
 */

public class CategoryMaster {

    @SerializedName("NODEID")
    private int nodeId;
    @SerializedName("CATEGORY")
    private String ctgry;
    @SerializedName("CatOrdr")
    private int catOrder;

    public int getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getCtgry() {
        return ctgry;
    }

    public void setCtgry(String ctgry) {
        this.ctgry = ctgry;
    }

    public int getCatOrder() {
        return catOrder;
    }

    public void setCatOrder(int catOrder) {
        this.catOrder = catOrder;
    }
}
