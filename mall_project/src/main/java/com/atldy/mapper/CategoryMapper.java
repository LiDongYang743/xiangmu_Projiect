package com.atldy.mapper;

import com.atldy.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-05-18 10:41
 */
@Mapper
@Repository
public interface CategoryMapper {

    @Select("select * from mall_category")
    List<Category> findAll();

    Category findById(Integer id);

}
