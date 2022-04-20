package view;

import datastructures.ADTSingleLinkedList;
import datastructures.listNode;
import model.Task;

public class taskListView {
    public void displayATask(Task aTask){
        System.out.println("Task Details");
        System.out.println("============");
        System.out.println("Task: " + aTask.getTheTask());
        System.out.println("Due Date: " + aTask.getTheDueDate());
        System.out.println("Team Member: " + aTask.getAllocatedTeamMember());
        System.out.println("Task Comments: " + aTask.getTaskComments());
        System.out.println("Task Tags: " + aTask.getTheTags());
    }

    public void displayATask(listNode<Task> aTask){
        System.out.println("Task Details");
        System.out.println("============");
        System.out.println("Task: " + aTask.getNodeData().getTheTask());
        System.out.println("Due Date: " + aTask.getNodeData().getTheDueDate());
        System.out.println("Team Member: " + aTask.getNodeData().getAllocatedTeamMember());
        System.out.println("Task Comments: " + aTask.getNodeData().getTaskComments());
        System.out.println("Task Tags: " + aTask.getNodeData().getTheTags());
    }


    public void displayListTasks(ADTSingleLinkedList<Task> listTasks){
        System.out.println("All Tasks");
        System.out.println("=========");
    }

}
