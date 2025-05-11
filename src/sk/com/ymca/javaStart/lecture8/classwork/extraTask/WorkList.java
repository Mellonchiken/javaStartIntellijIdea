package sk.com.ymca.javaStart.lecture8.classwork.extraTask;

/*
Необходимо разработать консольное приложение на языке Java, которое позволит пользователю управлять списком задач.
Система должна поддерживать следующие функции:

Добавление задачи – пользователь может добавить новую задачу, указав её описание и приоритет (низкий, средний, высокий).
Удаление задачи – пользователь может удалить задачу по её идентификатору.
Отображение списка задач – задачи выводятся в консоль с сортировкой по приоритету (от высокого к низкому).
Каждая задача должна иметь уникальный идентификатор, описание, приоритет и статус выполнения (выполнена/не выполнена).
Отметка задачи как выполненной – пользователь может пометить задачу как выполненную по её идентификатору.
Сохранение данных – список задач должен сохраняться в файл при завершении работы программы и загружаться при её старте.

Требования:
Использовать коллекции для хранения задач (например, ArrayList или HashMap).
Реализовать обработку исключений, чтобы программа не завершалась аварийно при некорректных вводах.
Организовать разделение логики на классы (например, классы Task, TaskManager, FileHandler).
 */
public class WorkList {
    String priority;
    String text;
    String status;

    public WorkList(String priority, String text, String status) {
        this.priority = priority;
        this.text = text;
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }

    public String getStatus() {
        return status;
    }

    public void delete() {

    }

    @Override
    public String toString() {
    return "Priority - " + getPriority() + '\n' + "Text - " + getText() + '\n' + "Status - " + getStatus();
    }
}
