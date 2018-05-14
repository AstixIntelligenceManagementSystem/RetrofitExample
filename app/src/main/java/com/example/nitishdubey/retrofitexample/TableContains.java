package com.example.nitishdubey.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Nitish Dubey on 09-05-2018.
 */

public class TableContains {

    @SerializedName("fnGetAllCategoryJasonResult")
    private List<TablesHeader> allCategoryJasonResult;
   /* @SerializedName("tblCategory")
    private List<CategoryMaster> ctgry;*/

    public List<TablesHeader> getAllCategoryJasonResult() {
        return allCategoryJasonResult;
    }

  /*  public void setCtgry(List<CategoryMaster> ctgry) {
        this.ctgry = ctgry;
    }

    public List<CategoryMaster> getCtgry() {
        return ctgry;
    }
*/

    public void setAllCategoryJasonResult(List<TablesHeader> allCategoryJasonResult) {
        this.allCategoryJasonResult = allCategoryJasonResult;
    }
}
