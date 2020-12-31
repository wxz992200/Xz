package com.xz.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.*;

public class Test1 {
    public static void main(String[] args) {

    isMonth("2012-2");


}public static void isMonth(String val){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");//设置日期格式
        String date=df.format(new Date());//获取当前日期的年份和月份
        out.println(date);
        if(date.equals(val)){
            out.println("在本月份");
        }else{
            out.println("不在本月份");
        }
    }
}
