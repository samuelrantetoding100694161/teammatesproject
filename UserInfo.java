package teammates.common.datatransfer;
import com.google.appengine.api.users.User;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserInfoTest {
    @Test
    public void testAdmin() {
        boolean isAdmin ;
        boolean val;

        val = UserInfo.getIsAdmin();
		
		assertThat(isAdmin).isEqualTo(val);
       
    }
    
    @Test
    public void testInstructor() {
        boolean isInstructor ;
        boolean val1;

        val1 = UserInfo.getIsInstructor();

        assertThat(isInstructor).isEqualTo(val1);
    }
    
      
    @Test
    public void testStudent() {
        boolean isStudent ;
        boolean val2;

        val2 = UserInfo.getIsStudent();

        assertThat(isStudent).isEqualTo(val2);
    }

}
