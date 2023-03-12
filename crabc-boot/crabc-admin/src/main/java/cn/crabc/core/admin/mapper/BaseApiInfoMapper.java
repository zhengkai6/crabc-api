package cn.crabc.core.admin.mapper;

import cn.crabc.core.admin.entity.BaseApiInfo;
import cn.crabc.core.admin.entity.dto.ApiInfoDTO;
import cn.crabc.core.admin.entity.vo.ApiComboBoxVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * API基本信息 Mapper接口
 *
 * @author yuqf
 */
public interface BaseApiInfoMapper {

    /**
     * API列表
     *
     * @param apiName
     * @return
     */
    List<BaseApiInfo> selectList(@Param("apiName") String apiName, @Param("devType") String devType);

    /**
     * 分组查询API信息
     *
     * @param groupId
     * @return
     */
    List<ApiComboBoxVO> selectApiGroup(Integer groupId);

    /**
     * 查询关联应用的API
     *
     * @param appId
     * @return
     */
    List<ApiComboBoxVO> selectApiApp(Long appId);

    /**
     * 根据Id查询基本信息
     *
     * @param apiId
     * @return
     */
    BaseApiInfo selectApiById(Long apiId);

    /**
     * 根据API地址查询详情
     *
     * @param apiPath
     * @param method
     * @return
     */
    BaseApiInfo selectApiInfo(@Param("apiPath") String apiPath, @Param("method") String method);


    List<ApiInfoDTO> selectApiDetail(Long apiId);

    /**
     * 插入API
     *
     * @param apiInfo
     * @return
     */
    Integer insertApiInfo(BaseApiInfo apiInfo);

    /**
     * 编辑API信息
     *
     * @param apiInfo
     * @return
     */
    Integer updateApiInfo(BaseApiInfo apiInfo);

    /**
     * 更新API状态
     *
     * @param apiInfo
     * @return
     */
    Integer updateApiState(BaseApiInfo apiInfo);

    /**
     * API校验统计
     *
     * @param apiId
     * @return
     */
    Integer countApi(Long apiId);
}