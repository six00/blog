package com.six.blog.mapper;

import com.six.blog.entity.TblSortInfo;
import com.six.blog.entity.TblSortInfoExample;
import java.util.List;

public interface TblSortInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblSortInfo record);

    int insertSelective(TblSortInfo record);

    List<TblSortInfo> selectByExample(TblSortInfoExample example);

    TblSortInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblSortInfo record);

    int updateByPrimaryKey(TblSortInfo record);
}