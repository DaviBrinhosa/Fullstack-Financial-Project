package com.whitecodepaladin.project2023.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.whitecodepaladin.project2023.entities.Login;
import com.whitecodepaladin.project2023.projections.UserBalanceProjection;

public interface LoginRepository extends JpaRepository<Login, Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT ML.LOGIN_ID AS iD, ML.USERNAME AS user, MB.BANK_ACCOUNT AS bank, MB.DESCRIPTION AS description, MB.TRANSITION_DATE AS date, MB.TRANSITION_VALUE AS value, MB.OBSERVATION AS observation
			FROM USER_BALANCE UB
			INNER JOIN MAIN_BALANCE MB
			ON UB.USER_ID = MB.USER_ID AND UB.BALANCE_ID = MB.BALANCE_ID
			INNER JOIN MAIN_LOGIN ML
			ON UB.LOGIN_ID = ML.LOGIN_ID
			WHERE UB.LOGIN_ID = :listId
			ORDER BY ML.USERNAME, MB.BANK_ACCOUNT, MB.DESCRIPTION, MB.TRANSITION_DATE, MB.TRANSITION_VALUE
			""")
	List<UserBalanceProjection> searchByList(Long listId);
}
