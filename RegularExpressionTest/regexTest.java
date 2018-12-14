package RegularExpressionTest;

public class regexTest {
    public static void main(String[] args) {
        //测试：
        String qq1 = "1832137835";
        String qq2 = "789j9371";
        String qq3 = "22";
        String qq4 = "012189783";
        boolean b1 = isQQ(qq1);
        boolean b2 = isQQ(qq2);
        boolean b3 = isQQ(qq3);
        boolean b4 = isQQ(qq4);
        
        System.out.println(qq1+"是qq号码吗？"+b1);
        System.out.println(qq2+"是qq号码吗？"+b2);
        System.out.println(qq3+"是qq号码吗？"+b3);
        System.out.println(qq4+"是qq号码吗？"+b4);
    }
    
    //练习1：匹配QQ号(长度为5-10位，纯数字组成，且不能以0开头)
    public static boolean isQQ(String qq) {
        //定义匹配规则：
        String regex = "[1-9][0-9]{4,9}";
        
        //判断是否符合规则
        boolean b = qq.matches(regex);
        
        return b;
    }
}