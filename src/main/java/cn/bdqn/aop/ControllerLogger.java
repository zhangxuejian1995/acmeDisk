package cn.bdqn.aop;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Created by samsung on 2018/3/2.
 */
public class ControllerLogger {
    private static final Logger log = Logger.getLogger("ControllerLogger");
    public void before(JoinPoint joinpoint){
        log.info(">>>>调用了"+joinpoint.getTarget()+"的"+joinpoint.getSignature().getName()+"入参为:"+ Arrays.toString(joinpoint.getArgs()));
    }
    public void after(JoinPoint jp , Object resource){
        log.info(">>>>>调用了"+jp.getTarget()+"的"
                                    +jp.getSignature().getName()+"返回值为:"+resource);
    }
}
