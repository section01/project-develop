package jp.co.web.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.web.infrastructure.model.UserModel;

/**
 * ユーザリポジトリ
 */
@Mapper
public interface UserMapper {

	/**
	 * 取得
	 */
    public UserModel findUserInformationByAuth(
            @Param("account")  String account,
            @Param("password") String password);

    /**
	 * 取得
	 */
    public UserModel findUserInformationByExist(
            @Param("id")   String id,
            @Param("name") String name);

}
