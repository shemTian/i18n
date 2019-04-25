package com.tsq.i18n.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author tianshunqian
 * 创建时间 2019/4/25 15:53
 **/
@Component
public class I18N {
    @Autowired
    private MessageSource messageSource;
    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[]{};
    /**
     * 获取默认的国际化配置,地域为系统默认{@link LocaleContextHolder#getLocale()}
     * @param code 配置key值
     * @return
     */
    public String getMessage(String code) {
        return messageSource.getMessage(code, EMPTY_OBJECT_ARRAY, LocaleContextHolder.getLocale());
    }
    /**
     * 获取默认的国际化配置,地域为系统默认{@link Locale#getDefault()}
     * @param code 配置key值
     * @param args 参数
     * @return
     */
    public String getMessage(String code,Object[] args) {
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }
    /**
     * 获取对应地域的国际化配置
     * @param code 配置key值
     * @param locale 地域
     * @return
     */
    public String getMessage(String code,Locale locale) {
        return messageSource.getMessage(code, EMPTY_OBJECT_ARRAY, locale);
    }
    /**
     * 获取对应地域的国际化配置
     * @param code 配置key值
     * @param args 替换参数
     * @param locale 地域
     * @return
     */
    public String getMessage(String code, Object[] args, Locale locale) {
        return messageSource.getMessage(code, args, locale);
    }

    /**
     * 获取对应地域的国际化配置,若为空返回指定的默认值
     * @param code 配置key值
     * @param args 参数
     * @param defaultMessage 指定默认值
     * @param locale 地域
     * @return
     */
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSource.getMessage(code, EMPTY_OBJECT_ARRAY,defaultMessage, locale);
    }
}
