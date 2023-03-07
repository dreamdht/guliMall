package com.flyfish.guliMall.member.dao;

import com.flyfish.guliMall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author flyfish
 * @email 1850370711@qq.com
 * @date 2023-03-07 17:36:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
