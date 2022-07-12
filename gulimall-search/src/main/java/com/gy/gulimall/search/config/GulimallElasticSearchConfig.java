package com.gy.gulimall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GulimallElasticSearchConfig {
    public static final RequestOptions COMMON_OPTIONS;

    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();

        COMMON_OPTIONS = builder.build();
    }




    @Bean
    public RestHighLevelClient restHighLevelClient(){

        RestHighLevelClient restHighLevelClient=new RestHighLevelClient(
                RestClient.builder(new HttpHost("47.113.189.196",9200,"http"))
        );
        return restHighLevelClient;

    }

}
