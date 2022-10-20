package net.eurotech.serapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.assertj.core.util.Arrays;

import net.eurotech.serapi.controller.EvidenciaRestControler;
import net.eurotech.serapi.entity.Documento;
import net.eurotech.serapi.service.DocumentoService;
import net.eurotech.serapi.service.EvidenciaService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EvidenciaRestControler.class)
public class EvidenciaRestControlerTests {
	
	@MockBean
	DocumentoService documentoService;
	@MockBean
	EvidenciaService evidenciaService;
	
	@Autowired
	MockMvc mockMvc;

	@Test
	public void testfindByHash() throws Exception {
		Documento documento = new Documento("1000"); 
		
		Mockito.when(documentoService.findByHash("1000")).thenReturn(documento);
		
		mockMvc.perform(get("/api/documento/1000"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("hash_md5", Matchers.is("1000")));
		
	}

}
