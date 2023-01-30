package com.xxxx.server.mapper;

import com.xxxx.server.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author moba
 * @since 2023-01-18
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据用户 id 查询对应角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
