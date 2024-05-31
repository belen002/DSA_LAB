public  class toDoListApplication {
    public static class Task {
        String title;
        String description;
        boolean completed;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
            this.completed = false;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {

            return description;
        }

        public boolean isCompleted() {

            return completed;
        }

        public void markCompleted() {

            this.completed = true;
        }
    }

    public static class node {
        Task task;
        node next;

        public node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public static class ToDoList {
        node head;

        public ToDoList() {
            this.head = null;
        }

        public void addToDo(Task newTask) {
            node newnode = new node(newTask);
            if (head == null) {
                head = newnode;
                return;
            }
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;

        }

        public void markToDoAsCompleted(String title) {
            node current = head;
            while (current != null) {
                if (current.task.getTitle().equalsIgnoreCase(title)) {
                    current.task.markCompleted();
                    return;
                }
                current = current.next;
            }
            System.out.println("Task with title '" + title + " " + "not found.");

        }

        public void ViewToDoList() {
            System.out.println(" To do list");
            System.out.println("-----------");
            node current = head;
            if (current == null) {
                System.out.println("There is no any task with in your to do list");
            } else {
                while (current != null) {
                   // for (int i = 1; i >= 1; i++) {
                        System.out.println(current.task.getTitle() + ":" + current.task.getDescription());
                        current = current.next;
                    }

                }
            }
        }

        public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();
            toDoList.addToDo(new Task("study", "take notes, review lecture, watch videos"));
            toDoList.addToDo(new Task("Relax", " read a book, cook dinner"));
            toDoList.addToDo(new Task("exercise", " go out for run for 30 minutes"));
            toDoList.ViewToDoList();
            toDoList.markToDoAsCompleted(" exercise");

        }

    }
//}

