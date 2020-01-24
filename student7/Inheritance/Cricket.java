package Inheritance;

public class Cricket  {
	
	private int ab=0;

	public int getab(String user, String pwd) {
		if ( user.contains("admin") && pwd.contains("temp123")) {
			return ab;
		}else {
			return -1;
		}
	}
	public void setab(int newab) {
		ab = newab;
	}

	protected void method() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
//     Cricket abc=new Cricket();
//     abc.NumbersOfPlyaer=11;
//     abc.PlayingTime=120;
//     abc.PlayersName="Sachine";
//     System.out.println(abc.NumbersOfPlyaer);
//	      }
	}
	private void hide() {
		System.out.println("hide");
	}
}

       
