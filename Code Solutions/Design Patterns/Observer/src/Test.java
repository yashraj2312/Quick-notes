/**
 * @author Nitinkumar Gove
 */
public class Test {
	public static void main(String a[]){
		Leader leader = new Leader();
		
		// adding observers to leader
		Candidate c = new Candidate(leader);
		Follower f = new Follower(leader);
		
		// update leader score and check for replication
		leader.setValue(100);
		leader.setValue(50);
		
	}

}
