package lad6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[]args){

        StringBuffer str = new StringBuffer(". การออกแบบทางสถาปัตยกรรม (Architecture Design) เป็นการออกแบบเพื่อการก่อสร้าง สิ่งก่อสร้างต่าง ๆ นักออกแบบสาขานี้ เรียกว่า สถาปนิก (Architect) ซึ่งโดยทั่วไปจะต้องทำงานร่วมกับ วิศวกรและมัณฑนากร โดยสถาปนิก รับผิดชอบเกี่ยวกับประโยชน์ใช้สอยและความงามของสิ่งก่อสร้าง งานทางสถาปัยตกรรมได้แก่\n" +
                "\n" +
                "- สถาปัตยกรรมทั่วไป เป็นการออกแบบสิ่งก่อสร้างทั่วไป เช่น อาคาร บ้านเรือน ร้านค้า  โบสถ์  วิหาร  ฯลฯ\n" +
                "\n" +
                "- สถาปัตยกรรมโครงสร้าง เป็นการออกแบบเฉพาะโครงสร้างหลักของอาคาร\n" +
                "\n" +
                "- สถาปัตยกรรมภายใน  เป็นการออกแบบที่ต่อเนื่องจากงานโครงสร้าง ที่เป็นส่วนประกอบของอาคาร");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord= strToken.countTokens();
        System.out.println("Word count:"+countWord);

        while (strToken.hasMoreTokens()) {
            System.out.println(strToken.nextToken());
        }

    }
}
