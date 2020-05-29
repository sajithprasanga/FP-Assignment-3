object Q1{
	def main(args:Array[String]){
		println(prime(8));
		println(prime(5));
		println(prime(1));
	}

	def GCD(a:Int , b:Int):Int=b match{
		case 0 => a;
		case b if b>a => GCD(b,a);
		case _ => GCD(b,a%b);
	}

	def prime(a:Int , b:Int=2):Boolean=b match{
		case x if(a==0) =>false;
		case x if(a==1) =>false;
 		case x if(x==a) =>true;
		case x if GCD(a,x)>1 => false;
		case x =>prime(a,x+1);
	}
}