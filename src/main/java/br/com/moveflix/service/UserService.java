package br.com.moveflix.service;

import br.com.moveflix.entity.User;
import br.com.moveflix.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }
}
