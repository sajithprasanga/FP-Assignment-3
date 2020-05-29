object Q2{
	def main(args:Array[String]){
		forr(5);
		
	}

	def forr(a:Int):Any={
		if (a>0) forr(a-1)
		if(prime(a)!=0){
			println(prime(a));
		}
	}

	def prime(a:Int , b:Int=2):Any=a match{
		case x if(x<2) => 0;
		case x if(x==2) => x;
		case x if(x%b==0) => 0;
		case x if(b*b>x) => x;
		case x =>prime(x , b+1);
	}
}




