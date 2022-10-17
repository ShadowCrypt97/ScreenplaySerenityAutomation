package models;

import lombok.Data;

import java.util.Map;
@Data
public class LoginData {
    private String username;
    private String password;

    public static LoginData createLoginData(Map<String,String> entry){
        LoginData loginData = new LoginData();
        loginData.setUsername(entry.get("username"));
        loginData.setPassword(entry.get("password"));
        return loginData;
    }
}
