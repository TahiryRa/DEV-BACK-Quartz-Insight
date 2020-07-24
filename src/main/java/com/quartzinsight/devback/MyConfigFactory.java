package com.quartzinsight.devback;

import org.pac4j.core.authorization.authorizer.RequireAnyRoleAuthorizer;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;
import org.pac4j.core.config.ConfigFactory;
import org.pac4j.core.profile.UserProfile;
import org.pac4j.http.client.indirect.IndirectBasicAuthClient;

public class MyConfigFactory implements ConfigFactory {


    
    public Config build(final Object... parameters) {
        
        final IndirectBasicAuthClient indirectBasicAuthClient = new IndirectBasicAuthClient(new UsernamePasswordAuthenticator());


        final Clients clients = new Clients("http://localhost:8080/api/test", indirectBasicAuthClient  );

        final Config config = new Config(clients);
        config.addAuthorizer("admin", new RequireAnyRoleAuthorizer<UserProfile>("ROLE_ADMIN"));
        return config;
    }
}
