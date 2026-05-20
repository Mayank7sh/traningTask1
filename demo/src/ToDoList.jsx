import TodoItem from './ToDoItem.jsx'
import './ToDoList.css'

function TodoList({ todos, onToggleTodo, onDeleteTodo }) {
  return (
    <div className="todo-list">
      {todos.length === 0 ? (
        <p className="empty-message">No todos yet. Add one to get started!</p>
      ) : (
        <ul>
          {todos.map((todo) => (
            <TodoItem
              key={todo.id}
              todo={todo}
              onToggleTodo={onToggleTodo}
              onDeleteTodo={onDeleteTodo}
            />
          ))}
        </ul>
      )}
    </div>
  )
}

export default TodoList
