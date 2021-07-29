package com.sda.denisbalaceanu.designpatterns.behaviour.chainofresponsibility.example;

public class Main
{
    public static void main(String[] args)
    {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        AuthenticationProcessor authProcessorChain = new UsernamePasswordProcessor(oAuthProcessor);

        boolean isAuthorized = authProcessorChain.isAuthorized(new OAuthTokenProvider());
        System.out.println(isAuthorized);
    }
}
