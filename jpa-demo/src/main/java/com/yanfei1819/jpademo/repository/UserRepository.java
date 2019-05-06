package com.yanfei1819.jpademo.repository;

import com.yanfei1819.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
