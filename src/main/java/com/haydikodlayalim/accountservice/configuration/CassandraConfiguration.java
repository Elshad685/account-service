package com.haydikodlayalim.accountservice.configuration;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.*;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.cassandra.*;

@Configuration
@EnableCassandraRepositories(basePackages = "com.baeldung.spring.data.cassandra.repository")
public class CassandraConfiguration extends AbstractCassandraConfiguration {
    @Value("${spcloud.cassandra.keyspace.name}")
    private String keyspaceName;
    @Value("${spcloud.cassandra.port}")
    private int port;
    @Value("${spcloud.cassandra.contact.point}")
    private String contactPoint;
    @Value("spcloud.cassandra.password")
    private String password;
    @Value("spcloud.cassandra.username")
    private String username;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

}
