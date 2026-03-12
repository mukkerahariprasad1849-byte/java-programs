package packages;

public class Base {

    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public static void main(String[] args) {

        Base obj = new Base();

        obj.setEid(101);
        obj.setEname("Hariprasad");

        System.out.println("Employee ID: " + obj.getEid());
        System.out.println("Employee Name: " + obj.getEname());
    }
}
