package com.minstone.utils;

import com.github.pagehelper.PageInfo;

/**
 * @Description: TODO
 * @ProjectName: data-interaction-center
 * @Package: com.minstone.utils
 * @Author: HuangPeiDong
 * @CreateDate: 2020/8/30 16:17
 */
public class PageConverter {
    public static void pass2Vo(PageInfo pageInfo, PageInfo  pageInfoVo) {
        pageInfoVo.setPageNum(pageInfo.getPageNum());
        pageInfoVo.setPageSize(pageInfo.getPageSize());
        pageInfoVo.setStartRow(pageInfo.getStartRow());
        pageInfoVo.setEndRow(pageInfo.getEndRow());
        pageInfoVo.setPages(pageInfo.getPages());
        pageInfoVo.setPrePage(pageInfo.getPrePage());
        pageInfoVo.setNextPage(pageInfo.getNextPage());
        pageInfoVo.setIsFirstPage(pageInfo.isIsFirstPage());
        pageInfoVo.setIsLastPage(pageInfo.isIsLastPage());
        pageInfoVo.setHasPreviousPage(pageInfo.isHasPreviousPage());
        pageInfoVo.setHasNextPage(pageInfo.isHasNextPage());
        pageInfoVo.setNavigatePages(pageInfo.getNavigatePages());
        pageInfoVo.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageInfoVo.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        pageInfoVo.setNavigateLastPage(pageInfo.getNavigateLastPage());
        pageInfoVo.setTotal(pageInfo.getTotal());
    }
}
