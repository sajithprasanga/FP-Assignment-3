object Q3{
	def main(args:Array[String]){
		print(prinm(5));
	}

	def prinm(n:Int):Int={
		if(n==1){
			1;
		} else{
			n+prinm(n-1);
		}
		 
		
	}

}



