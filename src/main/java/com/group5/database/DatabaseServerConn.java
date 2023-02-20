package com.group5.database;

import com.group5.proto.Listing.ListingServiceGrpc;
import com.group5.proto.User.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DatabaseServerConn {


    public static UserServiceGrpc.UserServiceStub getUserStub(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();

        UserServiceGrpc.UserServiceStub stub = UserServiceGrpc.newStub(channel);

        return stub;
    }
    public static UserServiceGrpc.UserServiceBlockingStub getUserBlockingStub(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);


        return blockingStub;
    }
    public static ListingServiceGrpc.ListingServiceBlockingStub getListingBlockingStub(){

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();


        ListingServiceGrpc.ListingServiceBlockingStub blockingStub = ListingServiceGrpc.newBlockingStub(channel);

        return blockingStub;
    }

    public static ListingServiceGrpc.ListingServiceStub getListingStub(){
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:6565").usePlaintext().build();


        ListingServiceGrpc.ListingServiceStub stub = ListingServiceGrpc.newStub(channel);

        return stub;
    }

}

