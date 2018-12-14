package RegularExpressionTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ҳ������ԣ���ȡĳ��ҳ�е�QQ����
 */
public class spiderTest {
    public static void main(String[] args) throws IOException {
        //1����ȡ��ҳ����(����IO����ȡ�ұ����html�ĵ�)
        File f = new File("tempFile\\spiderTest.html");
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        //2��ƥ�����qq����
        String regex = "[0-9]{5,10}@qq.com";//ƥ��5-10λqq�ź�@qq.com
        
        //3����ʼ��ȡ��
        Pattern p = Pattern.compile(regex);
        String line = null;
        
        while((line=br.readLine()) != null){//��ȡhtml�е�����
            Matcher m = p.matcher(line);    //ƥ����
            while(m.find()){
                System.out.println(m.group());//��ӡƥ�䵽��qq����
            }
        }
        
        br.close();//�ر�IO��
    }
    
}