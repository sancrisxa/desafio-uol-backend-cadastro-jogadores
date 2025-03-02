package br.com.sancrisxa.desafio_uol_backend_cadastro_jogadores.model;

public record Jogador(
        String nome, String email, String telefone, String codinome, GrupoCodinome grupoCodinome
) {
}
