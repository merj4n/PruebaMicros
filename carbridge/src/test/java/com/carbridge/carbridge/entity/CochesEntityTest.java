package com.carbridge.carbridge.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.carbridge.carbridge.database.domain.Coche;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;



@DataJpaTest
public class CochesEntityTest {
	
//	@Autowired
//	private TestEntityManager entityManager;
//
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();
//	
//	private Coche cochesEntity;
//	
//	@Before
//	public void setUp() {
//		cochesEntity = new Coche();
//		cochesEntity.setColor("Red");
//		cochesEntity.setId(new Long(1007));
//		cochesEntity.setNombre_modelo("Turbo GTO");
//	}
//	
//	@Test
//	public void verifyDataEntitySavedOk() {
//		
//		Coche datosGuardados = this.entityManager.persistAndFlush(cochesEntity);
//		assertThat(datosGuardados.getColor()).isEqualTo("Red");
//
//	}
	
}
