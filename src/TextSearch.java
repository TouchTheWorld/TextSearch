import java.io.File;
import java.util.Scanner;

/**
 * Created by namercx on 2016/11/17.
 */
public class TextSearch {
    File f=null;
    String aim;
    Scanner scan =null;

    public TextSearch(String a,String b){
        f=new File(a);
        aim=b;   //目标语句
        try {
            scan = new Scanner(f);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Search(){
        String strb;
        int line=0;
        while (scan.hasNext()) {
            line++;   //一般人从第一行开始计数
            strb=scan.next();
            if (strb.indexOf(aim)>0){       //书上说的方法，感觉很6
                System.out.println("Line "+line+":"+strb);
            }
        }
    }
}
