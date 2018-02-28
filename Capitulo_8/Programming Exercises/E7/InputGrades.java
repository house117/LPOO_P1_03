
package inputgrades;    
import javax.swing.JOptionPane;
public class InputGrades {
    public static void main(String[] args)
  {
    String userInput;
    int userInt;
    final int COURSES = 5;
    final int STUDENTS_NUMBER = 10;
    Student[] students = new Student[STUDENTS_NUMBER];
    for (int i = 0; i < students.length; i ++)
    {
      userInput = JOptionPane.showInputDialog(null, 
        "estudiante " + (i + 1) + " id number: ");
      userInt = Integer.parseInt(userInput); 
      students[i] = new Student();
      students[i].setStudentID(userInt);  
      for (int j = 0; j < COURSES; j++) 
      { 
         CollegeCourse c = new CollegeCourse(); 
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + "ID: "); 
         c.setCourseID(userInput); 
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + " Creditos: "); 
         c.setCreditHours(Integer.parseInt(userInput)); 
         userInput = JOptionPane.showInputDialog(null, 
           "estudiante " + (i + 1) + " curso " + (j + 1)
           + " calificacion: "); 
         while (userInput.charAt(0) != 'A' && userInput.charAt(0) != 'B' &&
           userInput.charAt(0) != 'C' &&  userInput.charAt(0) != 'D' &&  
           userInput.charAt(0) != 'E' &&  userInput.charAt(0) != 'F')
         {
           userInput = JOptionPane.showInputDialog(null, 
           "Error: intenta de nuevo \nestudiante" + (i + 1) 
             + " curso " + (j + 1) + " grado: ");
         }    
         c.setLetterGrade(userInput.charAt(0)); 
         students[i].setCourse(c, j);  
      }
    }
    for (int i = 0; i < students.length; i ++)
    {
      System.out.println("estudiante id " + students[i].getStudentID());
      for (int j = 0; j < COURSES; j++)
      {
        System.out.println("\tcurso ID: " + students[i].getCourse(j).getCourseID() 
          + "\n\t\tcreditos: " + students[i].getCourse(j).getCreditHours()
          + "\n\t\tgrado: " + students[i].getCourse(j).getLetterGrade());
      }
    }      
  } 
    
}
