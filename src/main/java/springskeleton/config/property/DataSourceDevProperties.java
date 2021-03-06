package springskeleton.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@ConfigurationProperties("spring.datasource")
@Profile("dev")
@Component
public class DataSourceDevProperties extends DataSourceProperties {

}
