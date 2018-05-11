package com.github.mkopylec.j2htmlplayground;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;

import java.util.Locale;

@Component
public class J2htmlViewResolver extends AbstractCachingViewResolver {

    @Override
    protected View loadView(String viewName, Locale locale) {
        return new J2htmlView();
    }
}
