package com.garage;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午3:15
 * To change this template use File | Settings | File Templates.
 */
public class TestGarage {

       private BaseGarageManage bgm = null;

      @Before
      public void init()
      {
          bgm = new BaseGarageManage();
          bgm.setMax_site_num(100);
      }

       /*
         测试停车
        */
        @Test
        public void should_return_99_after_stop_car()
        {
            bgm.useSite("李三","京B120456");
            assertEquals(99,bgm.getFreeSite());
        }

    /*
       正常取车
     */
       @Test
       public void should_return_100_after_get_car()
       {

            bgm.useSite("李三","京B120456");
            assertEquals(99,bgm.getFreeSite());
            assertTrue(bgm.freeSite("李三"));
            assertEquals(100,bgm.getFreeSite());
       }

    /*
       非正常取车，该车不存在
     */
      @Test
      public void car_not_exist_after_get_car()
      {
          bgm.useSite("李三","京B120456");
          assertEquals(99,bgm.getFreeSite());
          assertFalse(bgm.freeSite("李四"));
          assertEquals(99,bgm.getFreeSite());
          bgm.showFreeSite();
      }

    }

