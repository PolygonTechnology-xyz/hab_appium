package com.appium;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import static io.appium.java_client.service.local.flags.GeneralServerFlag.BASEPATH;

public class AppiumServer {

    static AppiumDriverLocalService server;

    //run appium server automatically
	public static void start(){
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        
        builder.withAppiumJS( new File("/home/jarin/node_modules/appium/lib/main.js"))
            .withArgument (BASEPATH, "/wd/hub")
            .withArgument (GeneralServerFlag.SESSION_OVERRIDE)
            .withArgument (GeneralServerFlag.LOG_LEVEL, "debug")
            .usingDriverExecutable(new File("/home/jarin/node_modules/appium/lib/main.js"))
	        .withIPAddress("192.168.12.172").usingPort(4723);

        server = AppiumDriverLocalService.buildService(builder);

        

        server.start();

        System.out.println( server.isRunning());
        System.out.println( server.getUrl());
    }

    public static void main( String[] args )
    {
        AppiumServer.start();
    }


}
