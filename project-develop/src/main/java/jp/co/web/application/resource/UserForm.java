package jp.co.web.application.resource;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザ管理画面フォーム
 */
@Getter
@Setter
public class UserForm implements Serializable {

    /**
     * 社員ID
     */
    private String id = null;

    /**
     * 社員名
     */
    private String name = null;

    /**
     * 権限
     */
    private String roles = null;

    /**
     * パスワード
     */
    private String password = null;

}
