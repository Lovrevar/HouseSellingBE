package com.group5.service.implementations;

import com.group5.database.DatabaseServerConn;
import com.group5.model.User;
import com.group5.model.UserDTO;
import com.group5.proto.User.*;
import com.group5.service.services.UserService;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    UserServiceGrpc.UserServiceBlockingStub blockingStub;
    UserServiceGrpc.UserServiceStub stub;

    public UserServiceImpl()
    {
        blockingStub= DatabaseServerConn.getUserBlockingStub();
        stub=DatabaseServerConn.getUserStub();
    }

    @Override
    public User getUserById(String email){

        UserResponse response = null;
        try{
            response = blockingStub.getUserById(GetUserByIdRequest.newBuilder()
                    .setEmail(email).build());
        } catch (StatusRuntimeException e) {
            System.out.println("User not found");
            e.printStackTrace();
        }
        return new User(response.getEmail(), response.getName(), response.getSurname());
    }

    @Override
    public Optional<User> createUser(UserDTO user) {
        CreateUserResponse response = blockingStub.createUser(CreateUserRequest.newBuilder().setEmail(user.getEmail()).setName(user.getName()).setSurname(user.getSurname()).setPassword(user.getPassword()).build());

        User user1 = new User(response.getEmail(), response.getName(), response.getSurname());

        return Optional.of(user1);
    }

    @Override
    public boolean Login(String email, String password) {
        LoginResponse response = blockingStub.checkLoginInfo(LoginInfo.newBuilder().setEmail(email).setPassword(password).build());

        return response.getIsValid();
    }

    @Override
    public Optional<User> registerUser(UserDTO user) {
        UserResponse response = blockingStub.registerUser(RegistrationInfo.newBuilder()
                .setEmail(user.getEmail()).setName(user.getName()).setSurname(user.getSurname()).setPassword(user.getPassword()).build());
        User user1 = new User(response.getEmail(), response.getName(), response.getSurname());
        return Optional.of(user1);
    }
}
