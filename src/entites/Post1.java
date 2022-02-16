package entites;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entites.Comments;


public class Post1 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("have a nice trip");
		Comments c2 = new Comments("wow thats awesome");
		
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"),
				                   "travelling to new zeland",
				                   "im gonna to visit this wonderfull country",
				                                                           12);
		
		post.addComments(c1);
		post.addComments(c2);
		
		System.out.println(post);
		
		

		Comments c3 = new Comments("good night");
		Comments c4 = new Comments("may the force be with you");
		
		Post post2 = new Post(sdf.parse("28/07/2018 14:19:19"),
				                   "good night ,guys",
				                   "see you tomorrrow",
				                                      5);
		post2.addComments(c3);
		post2.addComments(c4);
		
		System.out.println(post2);

	}
}
