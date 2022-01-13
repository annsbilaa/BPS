package com.example.bps.ipm;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class dataipm implements Serializable
{


    @Exclude
    private String key;
    private String tahun;
    private String total;
    public dataipm(){}
    public dataipm(String tahun, String total)
    {
        this.tahun = tahun;
        this.total = total;
    }

    public String getTahun()
    {
        return tahun;
    }

    public void setTahun(String tahun)
    {
        this.tahun = tahun;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }
    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }
}
