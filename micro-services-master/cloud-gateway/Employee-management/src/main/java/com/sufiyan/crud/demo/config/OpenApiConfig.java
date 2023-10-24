package com.sufiyan.crud.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Sufiyan", email = "abc@gmail.com", url = "http://localhost:8080/cruds"), description = "OpenApi documentaion for spring boot crud apps", title = "OpenApi specification - Sufiyan", version = "1.0", license = @License(name = "Licence name", url = "http://localhost:808/"), termsOfService = "Terms of service declare here"), servers = {
		@Server(description = "Local env", url = "http://localhost:808/"),
		@Server(description = "Prod env", url = "http://localhost:808/") },

		security = { @SecurityRequirement(name = "bearerAuth") })

@SecurityScheme(name = "BearerAuth", description = "JWT Auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)
public class OpenApiConfig {

}
