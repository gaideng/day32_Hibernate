package com.dg;


import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created：2017/12/7 on 16:44
 * Author:gaideng on dg
 * Description:
 */
public class App {
    @Test
    public void test(){
        try {
            DateFormat instance = DateFormat.getDateInstance();
            String format = instance.format(new Date());
//            System.out.println(mm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
