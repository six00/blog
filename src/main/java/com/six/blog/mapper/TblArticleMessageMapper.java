package com.six.blog.mapper;

import com.six.blog.entity.TblArticleMessage;
import com.six.blog.entity.TblArticleMessageExample;
import java.util.List;

public interface TblArticleMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblArticleMessage record);

    int insertSelective(TblArticleMessage record);

    List<TblArticleMessage> selectByExample(TblArticleMessageExample example);

    TblArticleMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblArticleMessage record);

    int updateByPrimaryKey(TblArticleMessage record);
}