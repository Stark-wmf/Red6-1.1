import com.sun.deploy.uitoolkit.impl.fx.FXPluginToolkit;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;


class Thread1 extends Thread implements Runnable{
        ArrayList<Student> list1 = new ArrayList<>();
        private String name;

    public Thread1(String name){
            this.name=name;
        }
        @Override
        public void run() {


            {for (int y = 0; y < 10; y++) {
                String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201821%1$s", y);


                String strJson = http.getURLContent(url);


                JSONObject jsonObject = JSONObject.fromObject(strJson);
                String data = jsonObject.getString("returnData");
                System.out.println(data);

                JSONArray jsonArray = new JSONArray();
                jsonArray = jsonArray.fromObject(data);
                for (int j = 0; j < jsonArray.size(); j++) {
                    JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                    String xh = item.getString("xh");                  // 获取对象对应的值S

                    Student student = new Student();
                    student.setStuId(xh);
                    student.setIfReal(true);
                    System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                    list1.add(student);

                    System.out.println(list1);
                    int i=0;
                    Connection conn = JDBCUTILS.getConnection();
                    String sql = "insert into students (stuId,ifReal) values(?,?)";
                    PreparedStatement pstmt;
                    try {
                        pstmt = (PreparedStatement) conn.prepareStatement(sql);
                        pstmt.setObject(1,xh);
                        pstmt.setObject(2,1);
                        i = pstmt.executeUpdate();
                        pstmt.close();
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }}

                }}

                }

                }



            class Thread2 extends Thread implements Runnable{
                ArrayList<Student> list2 = new ArrayList<>();
                private String name;
                public Thread2(String name){
                    this.name=name;
                }
                @Override
                public void run(){
                    for (int y=0;y<10;y++){
                        String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201721%1$s", y);


                        String strJson = http.getURLContent(url);



                        JSONObject jsonObject = JSONObject.fromObject(strJson);
                        String data = jsonObject.getString("returnData");
                        System.out.println(data);
                        JSONArray jsonArray = new JSONArray();
                        jsonArray=jsonArray.fromObject(data);
                        for (int j = 0; j <jsonArray.size(); j++) {
                            JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                            String xh = item.getString("xh");                  // 获取对象对应的值S

                            Student student = new Student();
                            student.setStuId(xh);
                            student.setIfReal(true);
                            System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                            list2.add(student);
                            System.out.println(list2);
                            int i=0;
                            Connection conn = JDBCUTILS.getConnection();
                            String sql = "insert into students (stuId,ifReal) values(?,?)";
                            PreparedStatement pstmt;
                            try {
                                pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                pstmt.setObject(1,xh);
                                pstmt.setObject(2,1);
                                i = pstmt.executeUpdate();
                                pstmt.close();
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }

                        }
                    }}}
                    class Thread3 extends Thread implements Runnable{
                        ArrayList<Student> list3 = new ArrayList<>();
                        private String name;
                        public Thread3(String name){
                            this.name=name;
                        }
                        @Override
                        public void run(){
                            for (int y=0;y<10;y++){
                                String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201621%1$s", y);


                                String strJson = http.getURLContent(url);



                                JSONObject jsonObject = JSONObject.fromObject(strJson);
                                String data = jsonObject.getString("returnData");
                                System.out.println(data);
                                JSONArray jsonArray = new JSONArray();
                                jsonArray=jsonArray.fromObject(data);
                                for (int j = 0; j <jsonArray.size(); j++) {
                                    JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                    String xh = item.getString("xh");                  // 获取对象对应的值S

                                    Student student = new Student();
                                    student.setStuId(xh);
                                    student.setIfReal(true);
                                    System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                    list3.add(student);
                                    System.out.println(list3);
                                    int i=0;
                                    Connection conn = JDBCUTILS.getConnection();
                                    String sql = "insert into students (stuId,ifReal) values(?,?)";
                                    PreparedStatement pstmt;
                                    try {
                                        pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                        pstmt.setObject(1,xh);
                                        pstmt.setObject(2,1);
                                        i = pstmt.executeUpdate();
                                        pstmt.close();
                                        conn.close();
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }}}
                                    class Thread4 extends Thread implements Runnable{
                                        ArrayList<Student> list5 = new ArrayList<>();
                                        private String name;
                                        public Thread4(String name){
                                            this.name=name;
                                        }
                                        @Override
                                        public void run(){
                                            for (int y=0;y<10;y++){
                                                String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201521%1$s", y);


                                                String strJson = http.getURLContent(url);



                                                JSONObject jsonObject = JSONObject.fromObject(strJson);
                                                String data = jsonObject.getString("returnData");
                                                System.out.println(data);
                                                JSONArray jsonArray = new JSONArray();
                                                jsonArray=jsonArray.fromObject(data);
                                                for (int j = 0; j <jsonArray.size(); j++) {
                                                    JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                                    String xh = item.getString("xh");                  // 获取对象对应的值S

                                                    Student student = new Student();
                                                    student.setStuId(xh);
                                                    student.setIfReal(true);
                                                    System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                                    list5.add(student);
                                                    System.out.println(list5);
                                                    int i=0;
                                                    Connection conn = JDBCUTILS.getConnection();
                                                    String sql = "insert into students (stuId,ifReal) values(?,?)";
                                                    PreparedStatement pstmt;
                                                    try {
                                                        pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                                        pstmt.setObject(1,xh);
                                                        pstmt.setObject(2,1);
                                                        i = pstmt.executeUpdate();
                                                        pstmt.close();
                                                        conn.close();
                                                    } catch (SQLException e) {
                                                        e.printStackTrace();
                                                    }

                                                }
                                            }}}
                                            class Thread5 extends Thread implements Runnable{
                                                ArrayList<Student> list6 = new ArrayList<>();
                                                private String name;
                                                public Thread5(String name){
                                                    this.name=name;
                                                }
                                                @Override
                                                public void run(){
                                                    for (int y=0;y<10;y++){
                                                        String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201421%1$s", y);


                                                        String strJson = http.getURLContent(url);



                                                        JSONObject jsonObject = JSONObject.fromObject(strJson);
                                                        String data = jsonObject.getString("returnData");
                                                        System.out.println(data);
                                                        JSONArray jsonArray = new JSONArray();
                                                        jsonArray=jsonArray.fromObject(data);
                                                        for (int j = 0; j <jsonArray.size(); j++) {
                                                            JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                                            String xh = item.getString("xh");                  // 获取对象对应的值S

                                                            Student student = new Student();
                                                            student.setStuId(xh);
                                                            student.setIfReal(true);
                                                            System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                                            list6.add(student);
                                                            System.out.println(list6);
                                                            int i=0;
                                                            Connection conn = JDBCUTILS.getConnection();
                                                            String sql = "insert into students (stuId,ifReal) values(?,?)";
                                                            PreparedStatement pstmt;
                                                            try {
                                                                pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                                                pstmt.setObject(1,xh);
                                                                pstmt.setObject(2,1);
                                                                i = pstmt.executeUpdate();
                                                                pstmt.close();
                                                                conn.close();
                                                            } catch (SQLException e) {
                                                                e.printStackTrace();
                                                            }

                                                        }
                                                    }}}
                                                    class Thread6 extends Thread implements Runnable{
                                                        ArrayList<Student> list7 = new ArrayList<>();
                                                        private String name;
                                                        public Thread6(String name){
                                                            this.name=name;
                                                        }
                                                        @Override
                                                        public void run(){
                                                            for (int y=0;y<10;y++){
                                                                String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201321%1$s", y);


                                                                String strJson = http.getURLContent(url);



                                                                JSONObject jsonObject = JSONObject.fromObject(strJson);
                                                                String data = jsonObject.getString("returnData");
                                                                System.out.println(data);
                                                                JSONArray jsonArray = new JSONArray();
                                                                jsonArray=jsonArray.fromObject(data);
                                                                for (int j = 0; j <jsonArray.size(); j++) {
                                                                    JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                                                    String xh = item.getString("xh");                  // 获取对象对应的值S

                                                                    Student student = new Student();
                                                                    student.setStuId(xh);
                                                                    student.setIfReal(true);
                                                                    System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                                                    list7.add(student);
                                                                    System.out.println(list7);
                                                                    int i=0;
                                                                    Connection conn = JDBCUTILS.getConnection();
                                                                    String sql = "insert into students (stuId,ifReal) values(?,?)";
                                                                    PreparedStatement pstmt;
                                                                    try {
                                                                        pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                                                        pstmt.setObject(1,xh);
                                                                        pstmt.setObject(2,1);
                                                                        i = pstmt.executeUpdate();
                                                                        pstmt.close();
                                                                        conn.close();
                                                                    } catch (SQLException e) {
                                                                        e.printStackTrace();
                                                                    }

                                                                }
                                                            }}}
                                                            class Thread7 extends Thread implements Runnable{
                                                                ArrayList<Student> list8 = new ArrayList<>();
                                                                private String name;
                                                                public Thread7(String name){
                                                                    this.name=name;
                                                                }
                                                                @Override
                                                                public void run(){
                                                                    for (int y=0;y<10;y++){
                                                                        String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201221%1$s", y);


                                                                        String strJson = http.getURLContent(url);



                                                                        JSONObject jsonObject = JSONObject.fromObject(strJson);
                                                                        String data = jsonObject.getString("returnData");
                                                                        System.out.println(data);
                                                                        JSONArray jsonArray = new JSONArray();
                                                                        jsonArray=jsonArray.fromObject(data);
                                                                        for (int j = 0; j <jsonArray.size(); j++) {
                                                                            JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                                                            String xh = item.getString("xh");                  // 获取对象对应的值S

                                                                            Student student = new Student();
                                                                            student.setStuId(xh);
                                                                            student.setIfReal(true);
                                                                            System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                                                            list8.add(student);
                                                                            System.out.println(list8);
                                                                            int i=0;
                                                                            Connection conn = JDBCUTILS.getConnection();
                                                                            String sql = "insert into students (stuId,ifReal) values(?,?)";
                                                                            PreparedStatement pstmt;
                                                                            try {
                                                                                pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                                                                pstmt.setObject(1,xh);
                                                                                pstmt.setObject(2,1);
                                                                                i = pstmt.executeUpdate();
                                                                                pstmt.close();
                                                                                conn.close();
                                                                            } catch (SQLException e) {
                                                                                e.printStackTrace();
                                                                            }


                                                                        }
                                                                    }}}
                                                                    class Thread8 extends Thread implements Runnable{
                                                                        ArrayList<Student> list9 = new ArrayList<>();
                                                                        private String name;
                                                                        public Thread8(String name){
                                                                            this.name=name;
                                                                        }
                                                                        @Override
                                                                        public void run(){
                                                                            for (int y=0;y<10;y++){
                                                                                String url = String.format("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=201121%1$s", y);


                                                                                String strJson = http.getURLContent(url);



                                                                                JSONObject jsonObject = JSONObject.fromObject(strJson);
                                                                                String data = jsonObject.getString("returnData");
                                                                                System.out.println(data);
                                                                                JSONArray jsonArray = new JSONArray();
                                                                                jsonArray=jsonArray.fromObject(data);
                                                                                for (int j = 0; j <jsonArray.size(); j++) {
                                                                                    JSONObject item = jsonArray.getJSONObject(j); //每条记录又由几个Object对象组成
                                                                                    String xh = item.getString("xh");                  // 获取对象对应的值S

                                                                                    Student student = new Student();
                                                                                    student.setStuId(xh);
                                                                                    student.setIfReal(true);
                                                                                    System.out.println("Json解析结果" + "学号 = " + student.getStuId());
                                                                                    list9.add(student);
                                                                                    System.out.println(list9);
                                                                                    int i=0;
                                                                                    Connection conn = JDBCUTILS.getConnection();
                                                                                    String sql = "insert into students (stuId,ifReal) values(?,?)";
                                                                                    PreparedStatement pstmt;
                                                                                    try {
                                                                                        pstmt = (PreparedStatement) conn.prepareStatement(sql);
                                                                                        pstmt.setObject(1,xh);
                                                                                        pstmt.setObject(2,1);
                                                                                        i = pstmt.executeUpdate();
                                                                                        pstmt.close();
                                                                                        conn.close();
                                                                                    } catch (SQLException e) {
                                                                                        e.printStackTrace();
                                                                                    }


                                                                                }
                                                                            }}}
                                                                            public class Main{
                                                                            public static void main(String[] args){

         Thread r1=new Thread1("2018");
        r1.start();
// 依次打印                                                                               try {
//                                                                                    r1.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }

                                                                                Thread r2=new Thread2("2017");
                                                                                r2.start();
//                                                                                try {
//                                                                                    r2.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r3=new Thread3("2016");
                                                                                r3.start();
//                                                                                try {
//                                                                                    r3.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r4=new Thread4("2015");
                                                                                r4.start();
//                                                                                try {
//                                                                                    r4.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r5=new Thread5("2014");
                                                                                r5.start();
//                                                                                try {
//                                                                                    r5.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r6=new Thread6("2013");
                                                                                r6.start();
//                                                                                try {
//                                                                                    r6.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r7=new Thread7("2012");
                                                                                r7.start();
//                                                                                try {
//                                                                                    r7.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }
                                                                                Thread r8=new Thread8("2011");
                                                                                r8.start();
//                                                                                try {
//                                                                                    r8.join();
//                                                                                } catch (InterruptedException e) {
//                                                                                    e.printStackTrace();
//                                                                                }


                                                                            }
}

