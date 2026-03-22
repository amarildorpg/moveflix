package br.com.moveflix.mapper;

import br.com.moveflix.controller.request.UserRequest;
import br.com.moveflix.controller.response.UserResponse;
import br.com.moveflix.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {
    public static User toUser(UserRequest request) {
        return User.builder()
                .nome(request.nome())
                .email(request.email())
                .password(request.password())
                .build();
    }
    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .nome(user.getNome())
                .email(user.getEmail())
                .build();
    }
}
