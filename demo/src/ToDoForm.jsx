import { useState } from 'react'
import './ToDoForm.css'

function TodoForm({ onAddTodo }) {
  const [input, setInput] = useState('')

  const handleSubmit = (e) => {
    e.preventDefault()
    if (input.trim() !== '') {
      onAddTodo(input)
      setInput('')
    }
  }

  return (
    <form className="todo-form" onSubmit={handleSubmit}>
      <input
        type="text"
        className="todo-input"
        placeholder="Add a new todo..."
        value={input}
        onChange={(e) => setInput(e.target.value)}
      />
      <button type="submit" className="todo-button">
        Add Todo
      </button>
    </form>
  )
}

export default TodoForm
