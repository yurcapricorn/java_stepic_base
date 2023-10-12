package com.softdevco;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * Напишите метод ternaryOperator, который из них построит новую функцию, возвращающую значение функции ifTrue, если предикат выполнен, и значение ifFalse иначе.
     * @param condition
     * @param ifTrue
     * @param ifFalse
     * @param <T>
     * @param <U>
     * @return
     */
    public static <T, U> Function<T, U> ternaryOperator(
      Predicate<? super T> condition,
      Function<? super T, ? extends U> ifTrue,
      Function<? super T, ? extends U> ifFalse) {
        return (t) -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }


}
