package day5;

public class rabbit {
	public static void main(String[] args) {

	  char play[][] ={ 
			  { 'X', 'X', 'X', 'R', 'X', 'R'},
			  { 'R', 'X', 'X', 'X', 'X', 'X'},
			  { 'X', 'X', 'R', 'X', 'X', 'X'},
			  { 'R', 'X', 'X', 'F', 'X', 'X'},
			  { 'X', 'R', 'X', 'X', 'X', 'X'},
			  { 'X', 'R', 'X', 'R', 'X', 'R'},
			  };	   
	  int catchNum = 0;
	  int Fi=0;//���� ��ġ ��
	  int Fj=0;//���� ��ġ ��
	  loop:for (int i=0;i<play.length;i++){
		  for (int j=0;j<play[1].length;j++){
			  if (play[i][j]=='F'){
				 Fi=i;
				 Fj=j;
				 break loop;
				 }
			 }
	 	}

	 int numi=0;//�࿡ �����ϴ� �䳢
	 int numj=0;//���� �����ϴ� �䳢
	 int numk=0;//�밢 ���� (��->��)
	 int numl=0;//(��->��)
	 for (int i=0;i<play.length;i++){
		 if (play[Fi][i]=='R'){
			 numi++;
		 }
		 if (play[i][Fj]=='R'){ //numi�� �����̾ ���ο� ��
			 numj++;
			 }
		 for (int j=0;j<play.length;j++){
			 if (j-i==Fi-Fj) {
				 if (play[j][i]=='R'){
					 numk++;
					 }
				 }else if(j+i==Fi+Fj) {
					 if (play[j][i]=='R'){
						 numl++;
						 }
					 }
			 }
		 }

	 catchNum=numi+numj+numk+numl;

	 System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);  

	}
}


