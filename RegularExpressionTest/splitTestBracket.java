package RegularExpressionTest;

public class splitTestBracket {
    public static void main(String[] args) {
        //��ϰ2��"����@@@���ģ�������ssssssss������"�������и�.
        String s = "����@@@���ģ�������ssssssss������";
        
        //�����и�
        String regex = "(.)\\1+";
        
        //�и����ַ������飺
        String[] ss = s.split(regex);
        
        for(String string:ss){
            System.out.println(string);
        }
        
    }
}