package com.eazybytes.eazyschool.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eazybytes.eazyschool.model.Holiday;

@Repository
public interface HolidayRepositry extends CrudRepository<Holiday, Integer>{
	
}
