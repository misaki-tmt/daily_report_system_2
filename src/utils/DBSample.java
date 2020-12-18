package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSample {
    // データベース接続のための変数
    private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException{

        //ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.jdbc.Driver");

        // DBと接続する
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/daily_report_system?useSSL=false",
                "repuser",
                "reppass"
                );

        // 取得した値を返す
        return con;
    }

    public static void close(){
        //接続を閉じる
        if (con != null){
            try{con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
