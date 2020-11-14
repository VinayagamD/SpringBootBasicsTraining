package com.vinaylogics.springdi.services.impl;

import com.vinaylogics.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Holla Mundo";
    }
}
