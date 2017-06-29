
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinivas
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
public class AbiyatTechnologies {
  List<Task> getAllDependencies() {
    // List<Task> lis= new ArrayList
   for( int i =0; i < this.taskList.size(); i++) {
         if(!taskList.contains(task.taskList.get(i)) {
		    taskList.add(task.taskList.get(i));
            task.taskList.get(i).getAllDependencies( );
		 }
}
}  
}
