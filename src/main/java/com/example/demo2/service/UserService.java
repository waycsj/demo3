package com.example.demo2.service;

import com.example.demo2.domain.User;
import com.example.demo2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//가장 먼저 어노테이션 Service적는다.
@RequiredArgsConstructor//일단 외움 + 왜 적는 지 모른다.
public class UserService {
  private final UserRepository userRepository;//이름을 부른다.호출 + CRUD 생성

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }//read를 get으로 표현

  public User getUserById(int id) {
    return userRepository.findById(id).get();//마지막에 왜 get()을 붙일까?
  }

  public User updateUser(int id, User user) {//제일 어려운 곳 : User타임(클래스타입) 유저업데이트하는 메서드 매개변수(id와 +  그외 유저가 가진 속성등)
    User oldUser = userRepository.findById(id).get(); //유저repository에서 Id를 통해서 찾아서 가지고 온다.->그걸 oldUser하는 변수에 저장
    oldUser.setName(user.getName());//유저의이름을 설정한다.(유저의 이름을 찾아서)
    oldUser.setAge(user.getAge());//유저의나이를 설정한다.(유저의 나이를 찾아서)
    oldUser.setAddress(user.getAddress());//마찬가지
    userRepository.save(oldUser);//유저리파지토리에 저장한다 변수를
    return oldUser;//결과 반환
  }

  public void deleteUserById(int id) {
    userRepository.deleteById(id);
  }
}
