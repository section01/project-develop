package jp.co.web.infrastructure.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.web.application.resource.WorkForm;
import jp.co.web.infrastructure.model.DetailModel;

/**
 * 勤怠詳細リポジトリ
 */
@Mapper
public interface DetailMapper {

	/**
	 * 取得
	 */
    public List<DetailModel> findDetail(
            @Param("id")     String id,
            @Param("period") String period);

    /**
     * 削除
     */
    public void deleteDetail(
            @Param("id")     String id,
            @Param("period") String period);

    /**
     * 登録
     */
    public void insertDetail(
    		@Param("id")      String id,
            @Param("period")  String period,
            @Param("details") List<WorkForm.Detail> details);

}
