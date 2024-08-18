package br.com.academia.finaljava.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
