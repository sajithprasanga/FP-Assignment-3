object Q5{
	def main(args:Array[String]){
		print(Even(5));
	}

	def Even(n:Int):Int={
		if(n==1){
			return 0;
		} else if(n%2 == 1){
			Even(n-1);	
		}else{
			n+Even(n-1);
		}
		 
		
	}

}