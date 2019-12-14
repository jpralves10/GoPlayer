package com.goplayer.application.rest.conteudo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/conteudo")
public class ConteudoResource {
	
	@RequestMapping("/downloadConteudo")
	public byte[] downloadConteudo(
		@RequestParam("cdConteudo") String cdConteudo, 
		final HttpServletResponse response
	) throws FileNotFoundException, IOException {
		
		String fileName = "c_000001.mp3";
		File file = new File("/empresas/tripcar/"+fileName);
		
		if(file.exists()) {
			response.setHeader("Content-Disposition", "attachment; filename=\""+ fileName +"\"");
			response.setContentType("application/octet-stream");
			response.setContentLength((int) file.length());
			try {
				//response.getOutputStream().write(IOUtils.toByteArray(new FileInputStream(file)));
				
				return IOUtils.toByteArray(new FileInputStream(file));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}