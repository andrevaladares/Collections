// Range
 enum DaysOfWeekEnum {
     SUNDAY,
     MONDAY,
     TUESDAY,
     WEDNESDAY,
     THIRSDAY,
     FRIDAY,
     SATURDAY
 }
 
 println DaysOfWeekEnum.values()
 
 Range daysOfWeek = DaysOfWeekEnum.SUNDAY..DaysOfWeekEnum.SATURDAY
 
 println daysOfWeek
 println daysOfWeek.class
 println daysOfWeek.size()

 println "It's ${daysOfWeek.contains(DaysOfWeekEnum.WEDNESDAY)} that daysOfWeek contains Wednesday."
 
 println daysOfWeek.from
 println daysOfWeek.to
 
// Lists
 List days = daysOfWeek as ArrayList
 println days.class
 println days
 println days.size()
 days.pop()
 println days
 days << DaysOfWeekEnum.SATURDAY
 println days
 println days[3]
 
 //Maps
 Map daysMap = [1:"Sunday", 2:"Monday", 3:"Tuesday", 4:"Wednesday", 5:"Thirsday", 6:"Friday", 7:"Saturday"]
 println daysMap
 println daysMap.getClass().name
 println daysMap.size()
 println daysMap.values()