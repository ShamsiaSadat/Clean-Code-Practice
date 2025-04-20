package chapter_8_Boundaries.usingThirdPartyCode.GoodPractice;

public interface JsonParser {
    <T> T fromJson(String json, Class<T> type);
}
