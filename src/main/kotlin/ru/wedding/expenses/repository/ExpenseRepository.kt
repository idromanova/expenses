package ru.wedding.expenses.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.wedding.expenses.model.Expenses

@Repository
interface ExpenseRepository: CrudRepository<Expenses, String> {
}