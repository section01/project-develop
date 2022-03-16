package jp.co.web.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 権限エンティティ
 */
@Getter
@Setter
public class AuthModel {

    /**
     * 社員番号
     */
    private String id = null;

    /**
     * 社員名
     */
    private String account = null;

	/**
	 * 権限
	 */
    private String roles = null;

    /**
     * パスワード
     */
    private String password = null;

}
