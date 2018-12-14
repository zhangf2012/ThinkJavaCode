package RegularExpressionTest;

public class splitTestBracket {
    public static void main(String[] args) {
        //练习2："张三@@@李四￥￥王五ssssssss江流儿"按叠词切割.
        String s = "张三@@@李四￥￥王五ssssssss江流儿";
        
        //叠词切割
        String regex = "(.)\\1+";
        
        //切割后的字符串数组：
        String[] ss = s.split(regex);
        
        for(String string:ss){
            System.out.println(string);
        }
        
    }
}