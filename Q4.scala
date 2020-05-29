object Q4{
	def main(args:Array[String]){
		if(search(10) == true){
			print("Even");
		}else{
			print("Odd");
		} 
		
	}
	
	def search(n:Int):Boolean={
		if(n==0){
			 true;
		}else if(n==1){
			false;
		}else{		
			search(n-2);
		}
	}
}