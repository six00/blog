package com.six.blog.mapper;

import com.six.blog.entity.TblArticleSort;
import com.six.blog.entity.TblArticleSortExample;
import java.util.List;

public interface TblArticleSortMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblArticleSort record);

    int insertSelective(TblArticleSort record);

    List<TblArticleSort> selectByExample(TblArticleSortExample example);

    TblArticleSort selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblArticleSort record);

    int updateByPrimaryKey(TblArticleSort record);
}