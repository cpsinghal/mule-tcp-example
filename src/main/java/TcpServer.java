import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class TcpServer implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		User user = (User) eventContext.getMessage().getPayload();
		System.out.println(user.getId() + " " + user.getFname() + " "
				+ user.getLname());
		return user;
	}

}
