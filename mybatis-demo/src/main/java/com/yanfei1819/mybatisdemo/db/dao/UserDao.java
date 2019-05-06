package com.yanfei1819.mybatisdemo.db.dao;

        import com.yanfei1819.mybatisdemo.db.dto.UserDto;
        import org.apache.ibatis.annotations.Select;

        import java.util.List;

/**
 * Created by 追梦1819 on 2019-05-05.
 */
public interface UserDao {

    @Select("select * from user ")
    List<UserDto> queryList();
}
