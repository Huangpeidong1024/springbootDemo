package com.minstone.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:
* @Author: HuangPeiDong
* @Date: 2020/8/30 15:59
**/
@Slf4j
public class BaseConverter<DO, VO> {

    /**
     * 单个对象转换
     */
    public VO convert(DO from, Class<VO> clazz) {
        if (from == null) {
            return null;
        }
        VO to = null;
        try {
            to = clazz.newInstance();
        } catch (Exception e) {
            log.error("初始化{}对象失败。", clazz, e);
        }
        convert(from, to);
        return to;
    }

    /**
     * 批量对象转换
     */
    public List<VO> convert(List<DO> fromList, Class<VO> clazz) {
        if (CollectionUtils.isEmpty(fromList)) {
            return null;
        }
        List<VO> toList = new ArrayList<VO>();
        for (DO from : fromList) {
            toList.add(convert(from, clazz));
        }
        return toList;
    }

    /**
     * 属性拷贝方法，有特殊需求时子类覆写此方法
     */
    protected void convert(DO from, VO to) {
        BeanUtils.copyProperties(from, to);
    }
}