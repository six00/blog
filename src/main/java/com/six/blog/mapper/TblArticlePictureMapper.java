package com.six.blog.mapper;

import com.six.blog.entity.TblArticlePicture;
import com.six.blog.entity.TblArticlePictureExample;
import java.util.List;

public interface TblArticlePictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblArticlePicture record);

    int insertSelective(TblArticlePicture record);

    List<TblArticlePicture> selectByExample(TblArticlePictureExample example);

    TblArticlePicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblArticlePicture record);

    int updateByPrimaryKey(TblArticlePicture record);
}