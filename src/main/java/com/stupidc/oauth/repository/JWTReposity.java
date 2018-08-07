package com.stupidc.oauth.repository;

import org.springframework.data.repository.CrudRepository;

import com.stupidc.oauth.entity.JWT;

public interface JWTReposity extends CrudRepository<JWT, String> {

}
