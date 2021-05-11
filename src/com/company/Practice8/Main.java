package com.company.Practice8;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Smith", 21, "1234"));
        persons.add(new Person("Michail", "Gordon", 27, "1234"));
        try {
            System.out.println(serialize(persons));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Juchka",3));
        try {
            String dogsJson = serialize(dogs);
            System.out.println(dogsJson);
            deserialize(dogsJson, Person.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



    }

    public static String serialize(List<?> objects) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();

        for (Object o: objects) {
            stringBuilder.append("{");
            for (Field field: o.getClass().getFields()) {
                final JsonIgnore fieldAnnotationIgnore = field.getAnnotation(JsonIgnore.class);
                if(fieldAnnotationIgnore != null){
                    continue;
                }

                final JsonName fieldAnnotation = field.getAnnotation(JsonName.class);
                String fieldValue;
                if(field.getType()==String.class){
                    fieldValue = "\":\"" + field.get(o).toString() + "\",";
                }
                else fieldValue = "\":" + field.get(o).toString() + ",";

                if(fieldAnnotation != null){
                    stringBuilder.append("\"").append(fieldAnnotation.value()).append(fieldValue);
                }
                else stringBuilder.append("\"").append(field.getName()).append(fieldValue);
            }
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}"+"\n");
        }
        return stringBuilder.toString();
    }

    public static void deserialize (String json, Class clazz){
        Map<String, String> newMap = Stream.of(json.split(","))
                .collect(Collectors.toMap(t -> t.toString().split(":")[0], t -> t.toString().split(":")[1]));
        newMap.put("qwe","rty");

        System.out.println("qwe " + newMap + newMap.get("qwe"));

    }
}
