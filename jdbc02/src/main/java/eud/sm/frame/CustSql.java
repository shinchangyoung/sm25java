package eud.sm.frame;

public class CustSql {
    //SQL을 관리하는 클래스

    public static String insert = "INSERT INTO cust VALUES (?,?,?,NOW(),NOW())";
    public static String select = "SELECT * FROM cust WHERE cust_id=?";
    public static String selectAll = "SELECT * FROM cust";
    public static String update = "UPDATE cust SET cust_pwd=?, cust_name=? WHERE cust_id=?";
    public static String delete = "DELETE FROM cust WHERE cust_id=?";
}