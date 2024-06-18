package ru.wedding.expenses.model

import jakarta.persistence.Id
import jakarta.persistence.Entity

@Entity
data class Expenses(
    @Id
    val id: Int,
    var cost: Double,
    var name: String,
    var description: String
)
