package my_shopping_system.buildName.web;

import lombok.RequiredArgsConstructor;
import my_shopping_system.buildName.common.MyLogger;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;
    //private final ObjectProvider<MyLogger> myLoggerProvider;

    public void logic(String id) {
    //    MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
