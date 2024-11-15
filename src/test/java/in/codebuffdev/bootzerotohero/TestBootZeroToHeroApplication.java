package in.codebuffdev.bootzerotohero;

import org.springframework.boot.SpringApplication;

public class TestBootZeroToHeroApplication {

    public static void main(String[] args) {
        SpringApplication.from(BootZeroToHeroApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
