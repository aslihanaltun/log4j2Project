package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalTime;
import java.lang.Thread;

public class myTimerLoggings
{

    private static final Logger logger = LogManager.getLogger(myTimerLoggings.class);

    public static void main( String[] args ) throws InterruptedException {

        while(true){
            LocalTime now =LocalTime.now();

            if(now.getSecond()==0){
                if(now.getMinute()==0)
                    logger.error("error");
                else
                    logger.info("info");
            }else
                logger.debug("debug");

            Thread.sleep(1000);

        }


    }
}
