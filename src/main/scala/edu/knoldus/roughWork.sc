val xs= List(1, 2, 3)
//def listLength[A](list: List[A])=(List[A]() /: list)
//{(list,0)=> 0+1}
val x=List()

def reverse2[A](xs:List[A])=
  (List[A]() /:xs){(xs,x)=>x::xs}