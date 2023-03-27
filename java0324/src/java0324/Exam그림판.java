package java0324;

import java0324.vo.MyCircle;
import java0324.vo.MyLine;
import java0324.vo.MyRect;
import java0324.vo.MyShape;

public class Exam그림판 {
    public static void main(String[] args) {
        MyShape ms1 = new MyShape(3,5);//x1,y1
        System.out.println(ms1);
        MyLine ml1 = new MyLine(3,5,4,6);//x1,y1,x2,y2
        System.out.println(ml1);
        MyRect mr1 = new MyRect(5,7,10,15);//x1,y1,width,height
        System.out.println(mr1);
        MyCircle mc1 = new MyCircle(3,10,5);//x1,y1,radius
        System.out.println(mc1);
        
        //다각형 MyPolygon(삼각, 사각, 오각, ...)
        //다각형 사용 샘플코드???
        //MyPolgon mp = new MyPolgon(1,1);
        //mp.add(2, 3);
        //mp.add(4, 7);
        
    }
}

