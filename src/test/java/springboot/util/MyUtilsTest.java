package springboot.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.modal.bo.RestResponseBo;
import springboot.modal.vo.UserVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUtilsTest {

    @Test
    public void MD5encodeTest() {
        UserVo temp = new UserVo();
        temp.setUid(1);
        temp.setUsername("admin");
        temp.setPassword("123456");

        String pwd = MyUtils.MD5encode(temp.getUsername() + temp.getPassword());
        System.out.println("pwd : " + pwd);

        temp.setPassword("a66abb5684c45962d887564f08346e8d");
        if (temp.getPassword().equals(pwd)) {
            System.out.println(temp.getPassword() + " == " + pwd);
        }

    }

}
