package ru.wedding.expenses.model

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
data class Expenses(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    var cost: Double,
    var name: String,
    var description: String
)
