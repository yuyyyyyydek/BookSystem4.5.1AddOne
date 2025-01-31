package com.nan.tool;

import javax.swing.*;
/**
 * Gain类，其中的俩个方法作用于  文本框中内容的获取
 * 获取文本框中的文本信息
 *
 */
public class Gain {
    private Gain(){}//工具类无参构造私有化，防止实例化


    public static String gain(JTextField textField){//获取指定文本框的内容信息
        String text = textField.getText();//获取指定文本框中的的内容信息
        return text;//返回指定文本框中的内容
    }

    public static String gain2(JPasswordField jPassword){//获取密码文本框中的内容
        char[] text = jPassword.getPassword();//获取密码框字符数集
        String password = String.valueOf(text);//将字符数集转化为字符串
        return password;//返回密码框中的内容
    }

}