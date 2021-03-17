package edu.kis.powp.factory;

public interface AbstractFactory<T> {
    T create(String factoryType);
}
