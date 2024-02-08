package org.example.module2.homework3.solution.ex2;

import java.util.function.Supplier;

@FunctionalInterface
public interface Garden<T extends Fruit> extends Supplier<T> {
}
