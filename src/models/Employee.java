package models;

import java.sql.Timestamp;

public class Employee{

        //フィールド
        private int id;
        private String code;
        private String name;
        private String password;
        private int admin_flag;
        private Timestamp created_at;
        private Timestamp updated_at;
        private int delete_flag;

        //引数なしコンストラクタ
        public Employee(){
        }

        //引数ありコンストラクタ
        public Employee(int id, String code, String name, String password, int admin_flag, Timestamp created_at, Timestamp updated_at, int delete_flag){
            this.id = id;
            this.code = code;
            this.name = name;
            this.password = password;
            this.admin_flag = admin_flag;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.delete_flag = delete_flag;
        }

        //getter,setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getAdmin_flag() {
            return admin_flag;
        }

        public void setAdmin_flag(int admin_flag) {
            this.admin_flag = admin_flag;
        }

        public Timestamp getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }

        public Timestamp getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(Timestamp updated_at) {
            this.updated_at = updated_at;
        }

        public int getDelete_flag() {
            return delete_flag;
        }

        public void setDelete_flag(int delete_flag) {
            this.delete_flag = delete_flag;
        }

    }
