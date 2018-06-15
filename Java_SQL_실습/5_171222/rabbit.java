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
	  int Fi=0;//여우 위치 행
	  int Fj=0;//여우 위치 열
	  loop:for (int i=0;i<play.length;i++){
		  for (int j=0;j<play[1].length;j++){
			  if (play[i][j]=='F'){
				 Fi=i;
				 Fj=j;
				 break loop;
				 }
			 }
	 	}

	 int numi=0;//행에 존재하는 토끼
	 int numj=0;//열에 존재하는 토끼
	 int numk=0;//대각 원소 (왼->오)
	 int numl=0;//(오->왼)
	 for (int i=0;i<play.length;i++){
		 if (play[Fi][i]=='R'){
			 numi++;
		 }
		 if (play[i][Fj]=='R'){ //numi와 독립이어서 새로운 조
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

	 System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);  

	}
}


