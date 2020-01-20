package com.kru.iot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * @author kru on 20-1-20
 * @project iot-event-processor
 */
@Configuration
@EnableCassandraRepositories(basePackages = {"com.kru.iot.repositories"})
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points:placeholder}")
    private String contactPoints;

    @Value("${spring.data.cassandra.port:0000}")
    private int port;

    @Value("${spring.data.cassandra.keyspace:placeholder}")
    private String keyspaceName;

/*
    @Value("${spring.data.cassandra.username}")
    private String username;

    @Value("${spring.data.cassandra.password}")
    private String password;
*/

    @Value("${spring.data.cassandra.schema-action}")
    private String schemaAction;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected boolean getMetricsEnabled() {
        return false;
    }
    /*@Override
    protected String getKeyspaceName() {
        return "smart_home";
    }

    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster =
                new CassandraClusterFactoryBean();
        cluster.setContactPoints("127.0.0.1");
        cluster.setPort(9142);
        return cluster;
    }*/

}