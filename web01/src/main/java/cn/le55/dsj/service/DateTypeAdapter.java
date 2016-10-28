package cn.le55.dsj.service;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTypeAdapter implements JsonSerializer<Date>,JsonDeserializer<Date> {

    private final SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");

    public Date deserialize(JsonElement json, Type date, JsonDeserializationContext context) throws JsonParseException {

        if (!(json instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }

        try {
            return  dateFormate.parse(json.getAsString());


        } catch (ParseException e) {
            throw new JsonParseException(e);
        }



    }

    public JsonElement serialize(Date src, Type arg1, JsonSerializationContext arg2) {
        String dateFormatAsString = dateFormate.format(new Date(src.getTime()));
        return new JsonPrimitive(dateFormatAsString);

    }

}