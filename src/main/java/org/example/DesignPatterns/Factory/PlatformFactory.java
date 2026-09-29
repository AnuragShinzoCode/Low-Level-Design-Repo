package org.example.DesignPatterns.Factory;

public class PlatformFactory {

    public static Platforn getPlatFormByName(String platform){
        Platforn p=null;
        if(platform.equals("Android")){
            p=new Android();
        } else if (platform.equals("IOS")) {
            p=new IOS();
        }
        else {
            throw new RuntimeException("PlatForm name  not found");
        }
        return p;
    }
}
