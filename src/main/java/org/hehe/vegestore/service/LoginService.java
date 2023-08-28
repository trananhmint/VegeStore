package org.hehe.vegestore.service;

import org.hehe.vegestore.entity.UsersEntity;
import org.hehe.vegestore.payload.request.SignUpRequest;
import org.hehe.vegestore.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UsersRepository usersRepository;

    public boolean checkLogin(String username, String password) {
        List<UsersEntity> list = usersRepository.findByUserNameAndPassword(username, password);
        return list.size() > 0;
    }

    public boolean insertUser(SignUpRequest signUpRequest) {
        try{
            UsersEntity user = new UsersEntity();
            user.setUserName(signUpRequest.getUserName());
            user.setPassword(signUpRequest.getPassword());
            user.setFirstName(signUpRequest.getFirstName());
            user.setLastName(signUpRequest.getLastName());
            user.setEmail(signUpRequest.getEmail());
            user.setPhone(signUpRequest.getPhone());
            user.setDob(signUpRequest.getDob());
            user.setGender(signUpRequest.getGender());
            user.setRegistrationDate(signUpRequest.getRegistrationDate());
            user.setLastLoginDate(signUpRequest.getLastLoginDate());

            usersRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
