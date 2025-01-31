package com.nan.tool;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * 设置文本字段的文字数量上限，百度搜索到的方法
 */
public class JTextFieldLimit extends PlainDocument {
    private JTextFieldLimit(){}//工具类无参构造私有化，防止实例化
    private int limit; //设置文字数量的上限

    public JTextFieldLimit(int limit){
        super();//调用父类构造
        this.limit = limit;
    }

    public void insertString(int offset, String str , AttributeSet attr) throws BadLocationException {
        if(str == null) return;

        //下面的判断条件改为自己想要的限制的条件即可，这里为限制输入的长度
        if((getLength() +str.length()) <= limit) {
            super.insertString(offset, str ,attr);//调用父类方法
        }

    }
}