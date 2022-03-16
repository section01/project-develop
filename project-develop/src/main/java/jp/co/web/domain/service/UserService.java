package jp.co.web.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.web.application.resource.UserForm;
import jp.co.web.infrastructure.mapper.AuthMapper;
import jp.co.web.infrastructure.mapper.UserMapper;

/**
 * ユーザ管理画面サービス
 */
@Service
@Transactional
public class UserService {

    /**
     * ユーザリポジトリ
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 権限リポジトリ
     */
    @Autowired
    private AuthMapper authMapper;

    /**
     * 登録
     */
    public void insertUser(UserForm userForm) {

        // ユーザ登録
        userMapper.insertUserInfo(userForm.getId(), userForm.getName());
        // 権限登録
        authMapper.insertAuthInfo(userForm.getId(), userForm.getName(), userForm.getRoles(), userForm.getPassword());

    }

    /**
     * 削除
     */
    public void deleteUser(UserForm userForm) {

        // ユーザ登録
        userMapper.deleteUserInfo(userForm.getId());
        // 権限登録
        authMapper.deleteAuthInfo(userForm.getId());

    }
}
