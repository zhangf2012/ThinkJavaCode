package RegularExpressionTest;

public class splitTest {
    public static void main(String[] args) {
        //练习1：切割字符串"张三@@@李四@@王五@茅台".
        String s = "张三@@@李四@@王五@茅台";
        
        //描述切割规则：以若干@来切割,用@+来表示：@这个符号至少出现一次这种情况
        String regex = "@+";
        
        //切割后的字符串数组：
        String[] ss = s.split(regex);
        
        for(String string:ss){
            System.out.println(string);
        }
        
    }
}