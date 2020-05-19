package com.atldy;

import com.atldy.domain.Category;
import com.atldy.mapper.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallProjectApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testFindAll(){
        List<Category> categoryList = categoryMapper.findAll();
        for (Category category : categoryList) {

            System.out.println("category = " + category);
        }
    }

    @Test
    public void testFindById(){
        Category category = categoryMapper.findById(100001);
        System.out.println("category = " + category);
    }

}
