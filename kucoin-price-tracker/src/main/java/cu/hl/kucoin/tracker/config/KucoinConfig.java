package cu.hl.kucoin.tracker.config;

import com.kucoin.sdk.KucoinClientBuilder;
import com.kucoin.sdk.KucoinRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author hlicea
 * @since 9/6/2021
 */
@Configuration
public class KucoinConfig {
    @Value("${kucoin.url}")
    private String url;

    @Bean
    public KucoinRestClient buildKucoinRestClient() throws IOException {
        KucoinClientBuilder builder = new KucoinClientBuilder().withBaseUrl(url);
        return builder.buildRestClient();
    }
}

