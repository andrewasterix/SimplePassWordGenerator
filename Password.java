
import java.util.Random;

public class Password {

	// 2.1 Array of Data Definition
	private Character[] Number = {'0','1','2','3','4','5','6','7','8','9'};
	private Character[] UpperCase = {'A','B','C','D','E','F','G','H','I','J','K','L',
			'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private Character[] LowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	private Character[] pwd;
	
	public Password(int pwd_long, boolean UpperBool, boolean LowerBool, boolean NumberBool) {
		
		pwd = new Character[pwd_long];
				
		Random Rchose = new Random();
		
		for(int i = 0; i < pwd_long; i++) {
			// 2.1 Random Number (1-4) to decide which Case choose 			
			int chose = Rchose.nextInt(4);
			
			Random Rcase = new Random();
			
			if(chose == 1 && UpperBool) {
				pwd[i] = UpperCase[Rcase.nextInt(25)];
			}else if(chose == 2 && NumberBool) {
				pwd[i] = Number[Rcase.nextInt(9)];
			}else if(chose == 3 && LowerBool) {
				pwd[i] = LowerCase[Rcase.nextInt(25)];
			}else {
				i--; // If i = 0 or i >3
			}
		}
	}
	
	// 2.2 Setter and Getter 
	public Character[] getPwd() {
		return pwd;
	}

	public void setPwd(Character[] pwd) {
		this.pwd = pwd;
	}
}
