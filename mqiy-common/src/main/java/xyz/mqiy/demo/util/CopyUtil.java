package xyz.mqiy.demo.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.Feature;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description BeanUtils
 * @Date 2021/5/12 16:11
 * @Created by chris
 */
public class CopyUtil {


    public static <T> T copyBean(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        return JSON.parseObject(JSON.toJSONString(source), clazz, Feature.OrderedField);
    }

    public static <S, T> List<T> copyList(List<S> sourceList, Class<T> clazz) {
        if (sourceList == null || sourceList.size() == 0) {
            return new ArrayList<>();
        }
        return JSONArray.parseArray(JSON.toJSONString(sourceList), clazz);
    }

}
