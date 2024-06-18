package ru.wedding.expenses.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.wedding.expenses.model.Expenses
import ru.wedding.expenses.services.ExpenseService

@RestController
@RequestMapping("/wedding/api")
class ExpenseController {
    @Autowired
    private lateinit var expenseService: ExpenseService

    @GetMapping
    fun getExpenses(): MutableList<Expenses> {
        return expenseService.getAllEntries()
    }

    @PostMapping("/new")
    fun addNewEntry(@RequestBody newEntry: Expenses) {
        expenseService.addNewEntry(expenses = newEntry)
    }

    @PutMapping("/update")
    fun updateEntry(@RequestBody newEntry: Expenses) {
        expenseService.updateEntry(expenses = newEntry)
    }
}