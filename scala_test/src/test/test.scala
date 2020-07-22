import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

import com.sun.deploy.util.StringUtils

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object test{
  private var test_czf = List.empty[Int]

  def main(args: Array[String]): Unit = {
////    val ar = Array("1","2")
////    val c = 2
////    val d = ar.contains(c)
////    val a = ar.contains(c.toString)
////    println(a)
////    println(d)
//    val list1 = List(1,2,3,4)
//
//    val list = List(8,9)
//    val c = list1 ++: list
//    val list2 = list1.map(_ * 10)
//    val list3 = c.map(_ * 10)
////    println("l2 " + list2)
////    println("c " + c)
////    println("l3 " + list3)
//
//
//    val s1 = "czf"
//
//
//    var arr = ArrayBuffer(1,2,3,4)
//    val cddd = arr.filter(_ % 2 == 0).map(_ * 2)
////    println(arr)
////    println(cddd)
//
//
//    var data:Date = new Date()
//    println(getDay(getDifferenceDay(-1)))
//    println(System.currentTimeMillis())


//    println(getTheSumOfTwoNumbers(1,2))

/*    val a = ListBuffer(Map("id" -> 3),Map("id" -> 1),Map("id" -> 2),Map("id" -> 4),Map("id" -> 5))
    val b = List(1,2,3)
    val d = List(2)

    a.foreach(println(_))


    val c = b.filterNot(p => d.contains(p))
    val e = a.filterNot(p => b.contains(p.get("id")))*/
//    println(c)
//    println(e)
//    println(System.currentTimeMillis()

//    val ret = if(1 + 1 == 2) 1 else 2

//    val ret = test
//    val ret = List(1,2,3,4)
//    val l = ret.toBuffer -= 4.toInt
//    println(l)
//    czftest()
    test5
  }


  def test(): Int = {
    if(1 == 1) {
       return 1
    }
    println("aaa")
    return 2
  }


  def getTheSumOfTwoNumbers(a : Int, b : Int) : Int = {
    val sum = a + b
    sum
  }
  def getDay(date: Date): String = {
    val dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    dateFormat.format(date)
  }

  def getDifferenceDay(days: Int): Date = {
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.DATE, days)
    calendar.getTime
  }

  def czftest(): Unit = {

//    val a = List((1,2),(3,4),(5,6),(7,8),(9,10))
//    val b = a.map(p => Map("czf" -> p._1, "czf2" -> p._2))
//
//    print(b)

    val a = List.empty[Int]
    val czf = List(3)
    val c = a ::: czf
    println(a)
//    val c = a ::= 3


  }

  def test3(): Unit = {
    val l = List("this", "is", "some", "test", "case")
    val c =  l.flatMap(s => s.toList)
    println(c)
  }

  def test4 = {
    val m = Map(1->"1", 2->"2", 3->"3")
    val c = m.keys.max
    println(c)
  }

  def test5 = {
    //    var l = List.empty[Int]
    //    l ::= 1
    //    l ::= 2
    //    val s = l.mkString
    //    val d = s.split(",").toList.map(_.toInt)

    //    val c = 1
    //    val b = 3
    //    println(5/b)
    //    val c = ""
    //    val d = StringUtils.isBlank(c)

    //    val a = List(1,2,3)
    //    val b = List(2,1,3)

//    val a = List((1, 2), (1, 3), (1, 4), (2, 3))
//    var b = List.empty[Int]
//    val c = a.filter(_._1 == 1).map(p => b ::= p._2)


//    test_czf ++= List(1,2,3,4)

//    println(test_czf)

//    val a = List("1,2,3", "4,5,6")
//    val b = a.map(_.split(",").toList)
//    val c = b(0)
//    val d = System.currentTimeMillis()
//
//    println(b)
//    println(c)
//    println(d)

//    for (_ <- 1 to 10) {
//      println("a")
//    }
//    val l = List(1,2,3,4,5,6)
//    l.map(p => println(p))
//    l.par.map(p => println(p))
//
//    l.foreach(println)
//
//    val v = for (i <- 1 to 10) yield i
//    println(v)

    val a = List(1, 2, 3, 4)
    val b = a.zipWithIndex
    val c = a.zip(List("a", "b", "c", "d"))
    val d = a.zip(List("e", "e", "f"))
    val f = List((1, "a"), (2, "b"), (3, "c"))

    val g = f.unzip
    val h = g._1
    val h2 = g._2

    println("b =>" + b)
    println("c =>" + c)
    println("d =>" + d)
    println("f =>" + f)
    println("g =>" + g)
    println("h1 =>" + h)
    println("g2 =>" + h2)
  }


}
