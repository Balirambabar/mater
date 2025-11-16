package com.java8Feature.lamdademo;

import java.util.Optional;

public class User {

    public Optional<String> getUserName(int id)
    {
        String name=null;
        if(id==101)
        {
             name ="Baliram";
        }
        if(id==102)
        {
            name="Bhakti";
        }
        return Optional.ofNullable(name);
    }
}
