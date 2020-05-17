package org.acme.getting.started;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/shopMenu")
public class GreetingResource {

    private Set<Products> products = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));


    public GreetingResource() {
        products.add(new Products("John",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-91.gif",3));
        products.add(new Products("John",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-91.gif",3));
        products.add(new Products("John",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-91.gif",3));
        products.add(new Products("John",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-91.gif",3));
    }



     @GET
    public Set<Products>list() {
        System.out.println(products);
        return products;
    }

    @POST
    public Set<Products> add(Products product) {
        products.add(product);
        return products;
    }

    
}


