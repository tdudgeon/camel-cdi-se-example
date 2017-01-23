package com.im.ext.xchem.filedrop;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by timbo on 20/01/17.
 */
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {

        from("timer:foo?period=5000")
                .log("I've been fired!");

    }
}
