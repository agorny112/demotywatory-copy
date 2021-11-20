package demotywatorycopy.configuration;

import demotywatorycopy.model.dao.PostEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Map<Long, PostEntity> data() {
        Map<Long, PostEntity> sampleData = new HashMap<>();
        return sampleData;
    }
}
