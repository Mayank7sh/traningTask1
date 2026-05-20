import './ToDoItems.css'

function TodoItem({ todo, onToggleTodo, onDeleteTodo }) {
  return (
    <li className={`todo-item ${todo.completed ? 'completed' : ''}`}>
      <input
        type="checkbox"
        checked={todo.completed}
        onChange={() => onToggleTodo(todo.id)}
        className="todo-checkbox"
      />
      <span className="todo-text">{todo.text}</span>
      <button
        onClick={() => onDeleteTodo(todo.id)}
        className="todo-delete"
      >
        Delete
      </button>
    </li>
  )
}

export default TodoItem
