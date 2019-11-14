package com.example.gallery1;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

class MapComparator implements Comparator<HashMap<String, String>> {
    private final String key;
    private final String order;

    public MapComparator(String key, String order)
    {
        this.key = key;
        this.order = order;
    }

    public int compare(HashMap<String, String> first,
                       HashMap<String, String> second)
    {
        // TODO: Null checking, both for maps and values
        String firstValue = first.get(key);
        String secondValue = second.get(key);
        if(this.order.toLowerCase().contentEquals("asc"))
        {
            return firstValue.compareTo(secondValue);
        }else{
            return secondValue.compareTo(firstValue);
        }

    }

    @Override
    public Comparator<HashMap<String, String>> reversed() {
        return null;
    }

    @Override
    public Comparator<HashMap<String, String>> thenComparing(Comparator<? super HashMap<String, String>> other) {
        return null;
    }

    @Override
    public <U> Comparator<HashMap<String, String>> thenComparing(Function<? super HashMap<String, String>, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<HashMap<String, String>> thenComparing(Function<? super HashMap<String, String>, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<HashMap<String, String>> thenComparingInt(ToIntFunction<? super HashMap<String, String>> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<HashMap<String, String>> thenComparingLong(ToLongFunction<? super HashMap<String, String>> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<HashMap<String, String>> thenComparingDouble(ToDoubleFunction<? super HashMap<String, String>> keyExtractor) {
        return null;
    }


}
