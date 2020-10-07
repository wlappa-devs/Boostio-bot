package org.tbplusc.app.util;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

import org.tbplusc.app.talent_helper.Hero;

import com.google.gson.Gson;

public class JSONDeserializer {
    private JSONDeserializer() {
        throw new IllegalStateException("Utility class");
    }

    private static Type heroArrayListType = new TypeToken<List<Hero>>() {
    }.getType();

    public static <T> T deserializeJSON(String json, Type type) {
        return new Gson().fromJson(json, type);
    }

    public static List<Hero> deserializeHeroList(String json) {
        return deserializeJSON(json, heroArrayListType);
    }
}
