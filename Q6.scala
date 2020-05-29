object Q6{
	def main(args:Array[String]){
		fib(10);	
	}

	def fb(n:Int):Int= n match{
		case n if n==0 =>0;
		case n if n==1 =>1;
		case n => fb(n-1)+fb(n-2);
	}

	def fib(n:Int):Any={
		if(n>0) fib(n-1);
		println(fb(n));
	}
}