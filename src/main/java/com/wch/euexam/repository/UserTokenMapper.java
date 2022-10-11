package com.wch.euexam.repository;

import com.wch.euexam.domain.UserToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTokenMapper extends BaseMapper<UserToken> {

    UserToken getToken(String token);

}
