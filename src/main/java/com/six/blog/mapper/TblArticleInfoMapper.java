package com.six.blog.mapper;

import com.six.blog.entity.TblArticleInfo;
import com.six.blog.entity.TblArticleInfoExample;
import java.util.List;

public interface TblArticleInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblArticleInfo record);

    int insertSelective(TblArticleInfo record);

    List<TblArticleInfo> selectByExample(TblArticleInfoExample example);

    TblArticleInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblArticleInfo record);

    int updateByPrimaryKey(TblArticleInfo record);
}