package com.mathjazz.grawalutowa;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.client.RestTemplate;

public class CurrencyController {

//    @Autowired
//    private Game game;

    public Currency getCurrency() {

        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject("https://api.exchangeratesapi.io/latest",
                    Currency.class);
            return currency;
    }
}
