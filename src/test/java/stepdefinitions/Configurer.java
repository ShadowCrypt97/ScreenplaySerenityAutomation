package stepdefinitions;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import models.LoginData;

import java.util.Locale;

public class Configurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return TypeRegistryConfigurer.super.locale();
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(LoginData.class, LoginData::createLoginData));
    }
}
