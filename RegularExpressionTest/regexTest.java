package RegularExpressionTest;

public class regexTest {
    public static void main(String[] args) {
        //���ԣ�
        String qq1 = "1832137835";
        String qq2 = "789j9371";
        String qq3 = "22";
        String qq4 = "012189783";
        boolean b1 = isQQ(qq1);
        boolean b2 = isQQ(qq2);
        boolean b3 = isQQ(qq3);
        boolean b4 = isQQ(qq4);
        
        System.out.println(qq1+"��qq������"+b1);
        System.out.println(qq2+"��qq������"+b2);
        System.out.println(qq3+"��qq������"+b3);
        System.out.println(qq4+"��qq������"+b4);
    }
    
    //��ϰ1��ƥ��QQ��(����Ϊ5-10λ����������ɣ��Ҳ�����0��ͷ)
    public static boolean isQQ(String qq) {
        //����ƥ�����
        String regex = "[1-9][0-9]{4,9}";
        
        //�ж��Ƿ���Ϲ���
        boolean b = qq.matches(regex);
        
        return b;
    }
}