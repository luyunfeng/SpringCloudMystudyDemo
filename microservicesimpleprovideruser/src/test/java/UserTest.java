import cn.lucode.ApplicationStart;
import cn.lucode.user.dao.UserRepository;
import cn.lucode.user.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;


/**
 * Created by yunfeng.lu on 2017/9/11.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
//        User user=userRepository.findUser("张三");
//        System.out.println(user);
        //userRepository.save(new User("qwe","李四",54,new BigDecimal(Double.toString(0.48))));
        List<User> userList = userRepository.findAll();
        System.out.println(userList.toString());

    }


    @Test
    public void test2() {
        User user = userRepository.findUser("张三");
        System.out.println(user);
    }

}
