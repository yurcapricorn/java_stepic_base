package com.softdevco;

class Pair<Integer, String> {

    private Integer num;
    private String str;

    private Pair(Integer num, String str){
        this.str = str;
        this.num = num;
    }
    public static <Integer, String> Pair<Integer, String> of(Integer num, String str){
        return new Pair<Integer, String>(num, str);
    }
    public Integer getFirst(){
        return num;
    }
    public String getSecond(){
        return str;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) object;

        if (num != null ? !num.equals(pair.num) : pair.num != null) return false;
        return str != null ? str.equals(pair.str) : pair.str == null;
    }

    public int hashCode() {
        int result = 1011;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (str != null ? str.hashCode() : 0);
        return result;
    }
}



