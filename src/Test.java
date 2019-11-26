import javafx.application.Application;
import javafx.stage.Stage;

import java.io.OutputStream;


public class Test  {

    private String str = "Hello World !!!" ;
    private String strGo = "重启程序员之路，Fighting！！！" ;
    public static void main(String[] args) {
        Test t = new Test() ;
        System.out.print(t.getStr()) ;

    }
    public String getStr(){
        return this.str +"\n"+this.strGo ;
    }


}
