
package com.jyeager.vendasonline.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.jyeager.vendasonline.repository")
public class MongoConfig {

}
