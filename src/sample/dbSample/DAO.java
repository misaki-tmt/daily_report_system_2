package sample.dbSample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Employee;
import utils.DBSample;

public class DAO{
    //データベース接続と結果取得のための変数
    static PreparedStatement pstmt;
    static ResultSet rs;

    public static List<Employee> index(){
        //呼び出し元のサーブレットに返すリストresultsの宣言
        List<Employee> results = new ArrayList<Employee>();

        try {
            //ドライバを読み込み、DBに接続する
            Connection con = DBSample.getConnection();

            //sqlにSQL文を入れる
            String sql = "select * from employees";
            //SQLインジェクション対策
            pstmt = con.prepareStatement(sql);

            //SQLの実行結果をrsに入れる
            rs = pstmt.executeQuery();

            // 値をrsから１行ずつ取り出してemployeeにいれる
            while(rs.next()){
                Employee employee = new Employee();
                employee.setName(rs.getString("name"));
                employee.setCode(rs.getString("code"));
                //resultsリストへ入れる
                results.add(employee);
            }

            //エラー発生時は以下の処理を実行
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //以下エラー発生時、非発生時共に実行される処理
            if( rs != null ){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if( pstmt != null ){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBSample.close();
        }
        //List型resultsを呼び出し元サーブレットへ渡す
        return results;
    }

}