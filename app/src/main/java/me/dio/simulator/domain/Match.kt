package me.dio.simulator.domain

data class Match (
    val descricao: String,
    val place: Place,
    val nomeTeam: Team,
    val awayTeam: Team
    )