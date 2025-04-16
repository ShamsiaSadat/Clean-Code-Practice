package chapter_8_boundaries.usingThirdPartyCode.GoodPractice;

public interface JsonParser {
    <T> T fromJson(String json, Class<T> type);
}
