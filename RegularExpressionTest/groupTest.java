package RegularExpressionTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class groupTest {
    public static void main(String[] args) {
        String s = "Hi ! Don't be moved by yourself Fzz";
        
        //1��ƥ���Ӵ�
        String regex = "\\b[a-zA-Z]{2}\\b";
        
        //2����ȡƥ����,ʹ��������ʽ�ķ�װ��Pattern����ȡƥ����
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        
        //3��ʹ��ƥ������group()��������ȡ:��find�������ж��Ƿ����ƥ���Ӵ�����ʹ��ƥ�����еķ���group()��ȡ�ַ�����ƥ����Ӵ�
        System.out.println("��"+s+"���е�������ĸ�ĵ����У�");
        while(m.find()){
            System.out.println(m.group());
        }
    }
}