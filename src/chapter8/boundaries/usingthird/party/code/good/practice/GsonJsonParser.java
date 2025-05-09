package chapter8.boundaries.usingthird.party.code.good.practice;

import com.google.gson.Gson;

public class GsonJsonParser implements JsonParser{

    private final Gson gson = new Gson();

    @Override
    public <T> T fromJson(String json, Class<T> type) {
        return gson.fromJson(json, type);
    }
}
