package com.study0406.member2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Member2Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Member2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String sql = "";

		List<Person> persons = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Person.class));

		persons.forEach(System.out::println);
	}

}
