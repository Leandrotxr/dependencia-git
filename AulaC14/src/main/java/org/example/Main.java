package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import musicas.Musica;

public class Main {
    public static void main(String[] args) {
        // Lista de músicas
        List<Musica> playlist = new ArrayList<>();
        playlist.add(new Musica("Bohemian Rhapsody", "5:55"));
        playlist.add(new Musica("Hotel California", "6:30"));
        playlist.add(new Musica("Smells Like Teen Spirit", "5:01"));
        playlist.add(new Musica("Scar Tissue", "3:35"));

        // Criar objeto Gson (com indentação bonita)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Converter lista para JSON
        String json = gson.toJson(playlist);

        // Salvar em arquivo
        try (FileWriter writer = new FileWriter("musicas.json")) {
            writer.write(json);
            System.out.println("Arquivo musicas.json gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 👉 Mostrar o JSON na tela
        System.out.println("Conteúdo do JSON gerado:");
        System.out.println(json);
    }
}
