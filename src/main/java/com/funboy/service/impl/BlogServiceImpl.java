package com.funboy.service.impl;

import com.funboy.entity.Blog;
import com.funboy.mapper.BlogMapper;
import com.funboy.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author funboy
 * @since 2022-04-28
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
