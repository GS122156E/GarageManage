package com.garage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */
public class BaseGarageManage {
    //最大停车位
    private int max_site_num = 100;

    //空闲停车位数
    private int free_site_num = 100;

    private Map<String,CarInfo> cars = new HashMap<String, CarInfo>();


    public void setMax_site_num(int max_site_num) {
        this.max_site_num = max_site_num;
        this.free_site_num = max_site_num;
    }

    /*
      获取空闲停车位
     */
    public int getFreeSite()
    {
        return this.free_site_num;
    }


    public boolean useSite(String name,String carno)
    {
        cars.put(name,new CarInfo(name,carno));
        free_site_num--;
        return true;
    }

    public boolean freeSite(String name)
    {
        boolean status = this.getKey(name);
        if(status)
        {
          cars.remove(name);
          free_site_num++;
        }
        return status;
    }

    private boolean getKey(String key)
    {
        CarInfo c = this.cars.get(key) ;
        if( c != null && c instanceof CarInfo)
            return true;
        return false;
    }

    public void showFreeSite()
    {
        System.out.println("====空闲车位："+this.free_site_num);
    }

}
