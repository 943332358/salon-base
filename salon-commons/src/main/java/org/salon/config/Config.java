package org.salon.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangxin
 * @date 2021/2/4 11:42
 * @since V1.0
 */
@Configuration
public class Config {

    @Bean
    public RestTemplate restTemplate() {
        var restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(Lists.newArrayList(new ByteArrayHttpMessageConverter(),
                new StringHttpMessageConverter(),
                new ResourceHttpMessageConverter(),
                new SourceHttpMessageConverter<>(),
                new AllEncompassingFormHttpMessageConverter(),
                new Jaxb2RootElementHttpMessageConverter(),
                new MappingJackson2HttpMessageConverter()));
        return restTemplate;
    }
}
