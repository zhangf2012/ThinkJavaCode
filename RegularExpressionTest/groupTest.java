package RegularExpressionTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class groupTest {
    public static void main(String[] args) {
        String s = "Hi ! Don't be moved by yourself Fzz";
        
        //1、匹配子串
        String regex = "\\b[a-zA-Z]{2}\\b";
        
        //2、获取匹配器,使用正则表达式的封装类Pattern来获取匹配器
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        
        //3、使用匹配器的group()方法来获取:（find方法是判断是否具有匹配子串）、使用匹配器中的方法group()获取字符串的匹配的子串
        System.out.println("”"+s+"“中的两个字母的单词有：");
        while(m.find()){
            System.out.println(m.group());
        }
    }
}