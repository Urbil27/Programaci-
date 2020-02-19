
public class Decimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] bidimensional = new char [5][5];
		for(int f=0, c =0;f<5;f++) 
		{
			for(c=0;c<5;c++) 
			{
				if(f==1) {
					bidimensional [f][c]='A';
				}
				else {
					bidimensional [f] [c]='.';
				}	
			}
		}
			for( int f=0,c=0;f<5;f++) 
			{
				
				for(c=0;c<5;c++) 
				{
					System.out.print(bidimensional[f][c]+" ");
				}
				System.out.println();
			}
		}
	}


