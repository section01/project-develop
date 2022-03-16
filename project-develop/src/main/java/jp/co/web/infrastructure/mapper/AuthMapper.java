package jp.co.web.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ユーザリポジトリ
 */
@Mapper
public interface AuthMapper {

    /**
     * 登録
     */
    public void insertAuthInfo(
            @Param("id") String id,
            @Param("account") String account,
            @Param("roles")   String roles,
            @Param("password") String password);

    /**
     * 削除
     */
    public void deleteAuthInfo(
            @Param("id") String id);
}
