package org.township.entity.user;

public class User {

    private String userName;

    private String password;

    private String token;

    private Integer age;

    private Integer sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public enum Sex{

        MAN("男生",1),

        WOMAN("女生",0);

        private String desc;

        private Integer number;

        private Sex(String desc,Integer number) {
            this.desc = desc;
            this.number =number;
        }

        public String getDesc() {
            return desc;
        }

        public Integer getNumber() {
            return number;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
