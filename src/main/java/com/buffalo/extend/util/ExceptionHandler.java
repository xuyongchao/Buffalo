package com.buffalo.extend.util;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ChrisChen on 2015/11/1.
 */
public class ExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {

        ModelAndView modelAndView = new ModelAndView(R.Views.ERROR);
        modelAndView.addObject("message", e.getMessage());

        return modelAndView;
    }

}
