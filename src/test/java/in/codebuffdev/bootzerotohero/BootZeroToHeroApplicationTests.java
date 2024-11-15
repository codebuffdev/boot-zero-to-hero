package in.codebuffdev.bootzerotohero;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BootZeroToHeroApplicationTests {

    @Test
    void contextLoads() {
    }

}
