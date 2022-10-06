package com.example.mylibrary;
import static com.example.mylibrary.hi.switchh;
import static java.lang.Math.pow;
public class wow {
    public  static void main(String[] args) {//psvm
    int grade = 60 ;
    char type = 'm';
   double a= score(grade,type);
   System.out.println("!!!!!!!!"+a);//sout
    boo(grade);
    switchh(grade);
    sum(10,20);
    array();
    editstr();
    }

    public  static double score(int grade, char type) {

        if(grade>=60&&type=='m')
            System.out.println("pass!\n"+grade);
        else
            System.out.println("NOpass");
        double  a = pow(2,10);
        System.out.println("byte:"+(int)a);
        System.out.println("==============");
        return a;
    }

    public static void boo(int grade) {
        boolean boo=true;
        if(grade<=60)
        {
            System.out.println("HIHI"+boo);
        }
        else
            System.out.println("HIHI"+boo);
        System.out.println("==============");

    }
    public static void sum(double... number)
    {
        int count = number.length;
        int total = 0;
        System.out.println("第一個"+number[0]);
        System.out.println("個數"+count);
        for(int i =0;i<count;i++)
        {
            total+=number[i];
        }
        System.out.println("total:"+total);
        System.out.println("=============");
            
    }

    public static void array() {
        int[] num={100,200,300};
        char[] word={'C','D','E'};
        String[] phase={"dog","cat","bird"};
        char[] chartonum={'4','2','1'};
        String[] strtonum={"1","2","3"};
        System.out.println("array"+num[1]+word[0]+phase[2]);
        int totalchar=(int)chartonum[0]+num[0];
        System.out.println(totalchar);
        int totalstr=Integer.parseInt(strtonum[0])+num[2];//用try catch接錯誤會比較好
        System.out.println(totalstr);
    }

    public static void editstr() {
        String s="hello";
        String t="world";
        s=t;
        System.out.println(s);
    }


}

