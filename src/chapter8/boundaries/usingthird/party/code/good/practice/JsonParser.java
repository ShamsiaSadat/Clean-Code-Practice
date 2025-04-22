package chapter8.boundaries.usingthird.party.code.good.practice;

public interface JsonParser {
    <T> T fromJson(String json, Class<T> type);
}
