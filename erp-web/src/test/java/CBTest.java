import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath*:applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CBTest {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void cbTest(){
        String encode = this.bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
    }
}
