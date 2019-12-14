package com.goplayer.application.socket.deserializer;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.goplayer.application.util.Pagina;

public class PaginaDeserializer implements JsonDeserializer<Pagina>{

	@Override
	public Pagina deserialize(JsonElement jsonElement, Type typeClass, JsonDeserializationContext context) throws JsonParseException {
		
		JsonObject jObject = jsonElement.getAsJsonObject();
        String cdEmpresa = jObject.get("cdEmpresa").getAsString();
        String deParametro = jObject.get("deParametro").getAsString();
        String deMensagem = jObject.get("deMensagem").getAsString();
        
        JsonElement element = jObject.get("registros");
        Type listType = new TypeToken<List<String>>() {}.getType();
        
        List<String> registros = new Gson().fromJson(element, listType);
        
        Pagina pagina = new Pagina();
        pagina.setCdEmpresa(cdEmpresa);
        pagina.setDeParametros(deParametro);
        pagina.setDeMensagem(deMensagem);
        pagina.setRegistros(registros);
		
		return pagina;
	}
}