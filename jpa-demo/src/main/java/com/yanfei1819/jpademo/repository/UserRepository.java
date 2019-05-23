package com.yanfei1819.jpademo.repository;

import com.yanfei1819.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);

//    @Query("select u from User u where u.id = :id ")
     @Query(value = "select u from User u where u.id = ?1 ",nativeQuery = true)
    User withIdQuery(@Param("id") Long id);
}
