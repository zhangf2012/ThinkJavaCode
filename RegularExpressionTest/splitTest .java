package RegularExpressionTest;

public class splitTest {
    public static void main(String[] args) {
        //��ϰ1���и��ַ���"����@@@����@@����@ę́".
        String s = "����@@@����@@����@ę́";
        
        //�����и����������@���и�,��@+����ʾ��@����������ٳ���һ���������
        String regex = "@+";
        
        //�и����ַ������飺
        String[] ss = s.split(regex);
        
        for(String string:ss){
            System.out.println(string);
        }
        
    }
}