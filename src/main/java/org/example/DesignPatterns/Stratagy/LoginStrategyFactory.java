package org.example.DesignPatterns.Stratagy;

public class LoginStrategyFactory {

    static LoginStrategy getLoginWay(String way){
        LoginStrategy login=null;
        if(way.equals("GOOGLE")){
            login=new GoogleLogin();
        }
        else if(way.equals("USERNAME")){
            login=new UsernameLogin();
        }
        else if(way.equals("OTP")){
            login=new OTPLogin();
        }
        return login;
    }
}
