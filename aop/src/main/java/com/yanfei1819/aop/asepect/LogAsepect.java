//package com.yanfei1819.aop.asepect;
//
//import org.springframework.stereotype.Component;
//
///**
// * Created by 追梦1819 on 2019-07-10.
// */
//@Aspect
//@Component
//public class LogAsepect {
//    // ..表示包及子包 该方法代表controller层的所有方法
//    @Pointcut("execution(public * com.sunwin.web.controller.*.add*(..)) ||  " +
//            "execution(public * com.sunwin.web.controller.*.insert*(..)) || " +
//            "execution(public * com.sunwin.web.controller.*.update*(..)) || " +
//            "execution(public * com.sunwin.web.controller.*.delete*(..))||"+
//            "execution(public * com.sunwin.web.controller.*.login*(..))"+
//            "execution(public * com.sunwin.web.controller.*.logout*(..))"
//    )
//    public void controllerMethod() { }
//}
