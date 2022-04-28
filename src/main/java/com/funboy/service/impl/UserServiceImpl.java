package com.funboy.service.impl;

import com.funboy.entity.User;
import com.funboy.mapper.UserMapper;
import com.funboy.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
