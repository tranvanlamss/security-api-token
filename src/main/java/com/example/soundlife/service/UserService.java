package com.example.soundlife.service;

import com.example.soundlife.dto.UserDto;
import com.example.soundlife.entity.UserEntity;
import com.example.soundlife.mapper.UserMapper;
import com.example.soundlife.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username);
        UserDto dto = userMapper.convertToDto(userEntity);

        SimpleGrantedAuthority grand = new SimpleGrantedAuthority(dto.getRole().getName());
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(grand);
        User user = new User(dto.getUsername(), userEntity.getPassword(), authorities);
        return user;
    }
}
