package com.six.blog.mapper;

import com.six.blog.entity.TblMessage;
import com.six.blog.entity.TblMessageExample;
import java.util.List;

public interface TblMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblMessage record);

    int insertSelective(TblMessage record);

    List<TblMessage> selectByExample(TblMessageExample example);

    TblMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblMessage record);

    int updateByPrimaryKey(TblMessage record);
}