package com.six.blog.mapper;

import com.six.blog.entity.TblArticleContent;
import com.six.blog.entity.TblArticleContentExample;
import java.util.List;

public interface TblArticleContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblArticleContent record);

    int insertSelective(TblArticleContent record);

    List<TblArticleContent> selectByExampleWithBLOBs(TblArticleContentExample example);

    List<TblArticleContent> selectByExample(TblArticleContentExample example);

    TblArticleContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblArticleContent record);

    int updateByPrimaryKeyWithBLOBs(TblArticleContent record);

    int updateByPrimaryKey(TblArticleContent record);
}