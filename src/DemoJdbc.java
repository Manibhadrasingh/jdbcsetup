import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/IntellijDemo";
        String user = "root";
        String pass = "";
//          crud operation queries
//        String str = "select * from demo_table";
//        String str = "insert into demo_table values (3, 'Aman', 26)";
//        String str = "update demo_table set name = 'Suraj', marks = 25 where id  = 3";
        String str= "delete from  demo_table where id =3 ";
        Connection conn =  DriverManager.getConnection(url,user,pass);
        Statement st = conn.createStatement();
//        ResultSet rs =  st.executeQuery(str);

//        Normal fetching data from the database

//        System.out.println("Connection successfully");
//        while(rs.next()){
//            System.out.println("Id :" + rs.getInt("id") + " Name :" + rs.getString("name") + " Marks :"+ rs.getInt("marks"));
//        }

//        crud operation
            int result = st.executeUpdate(str);
//        System.out.println("inseted successfully");
//        System.out.println("data updated successfully");
        System.out.println("data deleted successfully");


    }
}
