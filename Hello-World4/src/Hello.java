import java.io.IOException;
import java.io.Reader;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
      
        //Create a new student object
//      Student student = new Student("Satheesh","Mechanical", 70, 984503322, "satheesh@gmail.com" ); 
//      //Insert student data
//      int id = session.insert("Student.insert", student);
//		response.getWriter().append("<br> Record inserted successfully :").append(String.valueOf(id));
        
        //Get All Student Details
        List<Student> student = session.selectList("Student.getAll");
        
        //Get By ID Student Details
        //List<Student> student = session.selectList("Student.getById",2);
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        for(Student st : student ){
//           response.getWriter().append("<br> : "+String.valueOf(st.getId()) +"");
//           response.getWriter().append("<br> : "+st.getName());
//           response.getWriter().append("<br> : "+st.getBranch());
//           response.getWriter().append("<br> : "+st.getPercentage());
//           response.getWriter().append("<br> : "+st.getEmail());
//           response.getWriter().append("<br> : "+st.getPhone());
        	response.getWriter().append("\n"+st.toString());
        }
        response.getWriter().append("\nRecord read successfully :");
        
        
//        Student student = (Student) session.selectOne("Student.getById", 4);
//        response.getWriter().append("<br>Current details of the student are" );
//        response.getWriter().append("<br>"+student.toString());
//        
//        //Set new values to the mail and phone number of the student
//        student.setName("Narayana Nair");
//        student.setBranch("CIVIL ENG");
//        student.setEmail("Narayana@yahoo.com");
//        student.setPhone(90000000);
//        
//        //Update the student record
//        session.update("Student.update",student);
//        response.getWriter().append("<br>Record updated successfully");
        
        
        //Delete operation
        //session.delete("Student.deleteById", 2);
        
       //verifying the record 
//        Student std = (Student) session.selectOne("Student.getById", 2);
//        
//        if(std != null) {
//        	response.getWriter().append("<br>Details of the student after update operation");
//            response.getWriter().append("<br>"+std.toString());
//        }
        
        session.commit();
        session.close();
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
