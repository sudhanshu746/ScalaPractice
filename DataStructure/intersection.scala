

/*
Given two arrays of integers of size M and N, write a function that returns the intersection of the two arrays in O(M + N) time. Do not use built in intersection functions or libraries. *  
*/


// [Language used to program : Scala]
// Hash Table approach will reduce complexity to O(m+n)
def intersection(A:Array[Int],B:Array[Int]): Array[Int] =  {
	var result = Array[Int]()
	val hashMap = scala.collection.mutable.HashMap.empty[Int,Boolean]
	for(i<-A){
		hashMap += (i->true) 
	}
	for(j<-B){
		if (hashMap contains j) {
			result = result :+ j
		}
	}
	return(result)
}

intersection(Array(2,3,4),Array(3,4,2))

# Memoisation way to reduce complexity	
def intersection(A:Array[Int],B:Array[Int]): Array[Int] =  {
var memo=Array[Int]();
var result=Array[Int]();
for (a<-A)
{
	if(memo.contains(a)) {
		result= result :+ a;}
	else {
		for (b<-B) 
		{
			if(a == b) {
				result= result :+ a;
				} else { memo=memo :+ b;}
	} }
}
}
			
				