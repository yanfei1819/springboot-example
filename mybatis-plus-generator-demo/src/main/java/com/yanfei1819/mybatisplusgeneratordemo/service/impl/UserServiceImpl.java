package com.yanfei1819.mybatisplusgeneratordemo.service.impl;

import com.yanfei1819.mybatisplusgeneratordemo.entity.User;
import com.yanfei1819.mybatisplusgeneratordemo.mapper.UserMapper;
import com.yanfei1819.mybatisplusgeneratordemo.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 追梦1819
 * @since 2019-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
