package com.garage;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public class CarInfo {

    private String name=null;
    private String carno = null;

    public CarInfo(){}
    public CarInfo(String name,String carno)
    {
        this.name = name;
        this.carno = carno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }
}
