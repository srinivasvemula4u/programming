
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
/*
A -> B, C
B ->  D
C -> D
D -> E
E -> {}
List<Task> getAllDependencies()
b.getAllDependencies = {D,E}
a.getAllDepencies = {B,C,D,E}
*/


/*[5:06:06 PM] Srinivas  Vemula: List<Task> getAllDependencies() {
    // List<Task> lis= new ArrayList
   for( int i =0; i < this.taskList.size(); i++) {
         if(!taskList.contains(task.taskList.get(i)) {
      taskList.add(task.taskList.get(i));
            task.taskList.get(i).getAllDependencies( );
   }
}
}*/

public class AbiyatTechnologies {
 class Task {
   private Long taskId;
   private String taskName;
   private String taskOwner;
   private String taskStartDate;
   private String taskEndDate;
   private List<Task> taskList = new ArrayList<>();
}   
 List<Task> getAllDependenciesHelper(Task task, List<Task> taskList) {
   
   for( int i =0; i < task.taskList.size(); i++) {
         if(taskList.contains(task.taskList.get(i))) {
		     getAllDependenciesHelper(task.taskList.get(i),taskList);
		 } else {
		    taskList.add(task.taskList.get(i));
			 getAllDependenciesHelper(task.taskList.get(i),taskList);
		 }
}
   return taskList; 
}
 
}
