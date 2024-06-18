package ru.wedding.expenses.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.wedding.expenses.model.Expenses
import ru.wedding.expenses.repository.ExpenseRepository

@Service
class ExpenseService {
    @Autowired
    private lateinit var expenseRepository: ExpenseRepository

    fun getAllEntries() = expenseRepository.findAll().toMutableList()

    fun addNewEntry(expenses: Expenses) {
        expenseRepository.save(expenses)
    }

    fun updateEntry(expenses: Expenses) {
        val entry = expenseRepository.findById(expenses.id.toString()).get()
        entry.name = expenses.name
        entry.cost = expenses.cost
        entry.description = expenses.description
        expenseRepository.save(entry)
    }
}