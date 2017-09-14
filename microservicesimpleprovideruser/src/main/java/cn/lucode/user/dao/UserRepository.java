package cn.lucode.user.dao;

import cn.lucode.user.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by yunfeng.lu on 2017/9/10.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u where u.name=:name")
    User findUser(@Param("name") String name);




}
