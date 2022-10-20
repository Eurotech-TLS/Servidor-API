package net.eurotech.serapi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import net.eurotech.serapi.controller.EvidenciaRestControler;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SerapiApplicationTests {
	
	@Autowired
	EvidenciaRestControler evidenciaRestControler;

	@Test
	public void contextLoad() {
		Assertions.assertThat(evidenciaRestControler).isNotNull();
		
	}

}
