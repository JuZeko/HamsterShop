package org.acme.getting.started;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList; 

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/")
public class GreetingResource {

    private Set<Products> products = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    private Set<Products> shopingList = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public GreetingResource() {
        products.add(new Products("Robin Fraser",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-91.gif",0));
        products.add(new Products("Albert George",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-28-67.gif",0));
        products.add(new Products("Brodie Miller",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-29-78.gif",0));
        products.add(new Products("Christian John",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-30-48.gif",0));
        products.add(new Products("Troy White",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-32-44.gif",0));
        products.add(new Products("Tristan Holland",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-33-12.gif",0));
        products.add(new Products("Kingsley Holmes",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-33-77.gif",0));
        products.add(new Products("Eric Hudson",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-35-60.gif",0));
        products.add(new Products("Reggie Lawrence",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-35-88.gif",0));
        products.add(new Products("John Honki",10,"https://pic.funnygifsbox.com/uploads/2019/06/funnygifsbox.com-2019-06-10-13-08-32-87.gif",0));
    }


@Path("/shopMenu")
     @GET
    public Set<Products>list() {
        
        return products;
    }


    @Path("/list")
     @GET
    public Set<Products>list1() {
        
        return products;
    }

@Path("/shopMenu")
    @POST
    public Set<Products> add(Products product) {

       shopingList.forEach(System.out::println);


        shopingList.add(product);
        return products;
    }

    
@Path("/info")
    @POST
    public Set<Products> addP(Products product) {

       shopingList.forEach(System.out::println);


        shopingList.add(product);
        return products;
    }




}


