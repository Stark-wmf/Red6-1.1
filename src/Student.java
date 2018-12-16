public class Student {
    public String stuId;
    public boolean ifReal;   //为true，表示是正确的学号，为false，表示是错误的学号。

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public boolean isIfReal() {
        return ifReal;
    }

    public void setIfReal(boolean ifReal) {
        this.ifReal = ifReal;
    }

    @Override
    public String toString() {
        return "学生学号: "+stuId+"是否存在; "+ifReal;
    }
}
