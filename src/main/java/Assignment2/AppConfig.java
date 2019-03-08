package Assignment2;
import org.springframework.context.annotation.Bean;

public class AppConfig
{
    @Bean(name="banks")
    public Bank getImprovedService(){
        return new Absa();

    }
}
