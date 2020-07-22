package test

import java.text.{ParseException, SimpleDateFormat}
import java.util.{Calendar, Date, Random}
/**
  * @description: TODO
  * @author czf
  * @date 2020/6/5 20:20
  */
class ExceptionExample{
  def divide(a:Int, b:Int) = {
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
    }catch{
      case e: ArithmeticException => println(e)
      case ex: Throwable =>println("found a unknown exception"+ ex)
    }
    println("Rest of the code is executing...")
  }
}


class Test {


  def getLastWeekOfYear: Int = {
    val cal = Calendar.getInstance
    cal.add(Calendar.DATE, -7)
    cal.get(Calendar.WEEK_OF_YEAR)
  }

  def getLastMonthDate: Date = {
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.MONTH, -1)
    calendar.getTime
  }

  /** 获取当天零点时刻 **/
  def getZeroTime(): Calendar ={
    val cal  = Calendar.getInstance()
    cal.set(Calendar.HOUR_OF_DAY, 0)
    cal.set(Calendar.MINUTE, 0)
    cal.set(Calendar.SECOND, 0)
    cal.set(Calendar.MILLISECOND, 0)
    cal
  }

  def isSameDay(date1: Date, date2: Date): Boolean = {
    if (date1 == null || date2 == null) return false
    val cal1: Calendar = Calendar.getInstance
    cal1.setTime(date1)
    val cal2: Calendar = Calendar.getInstance
    cal2.setTime(date2)
    if (cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) true else false
  }

  /**
    * 检查指定的时间time是否在给定的时间范围内，
    *
    * @param time
    * @param time1 格式：yyyy-MM-dd HH:mm:ss
    * @param time2 格式：yyyy-MM-dd HH:mm:ss
    * @return
    */
  def checkTime(time: Long, time1: String, time2: String): Boolean = {
    val df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    try {
      val d1 = df.parse(time1)
      val d2 = df.parse(time2)
      time > d1.getTime && time < d2.getTime
    } catch {
      case e: ParseException => false
    }
  }


}

object Demo{
  def main(args:Array[String]){
    var e = new ExceptionExample()
    e.divide(100,10)

  }
}