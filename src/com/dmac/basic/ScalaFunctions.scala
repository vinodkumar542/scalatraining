package com.dmac.basic

object ScalaFunctions {
  
  def main(args: Array[String]) = {
    
    val clazz = new AScalaClass
    
    // Function with empty parameters
    println(clazz.fetchCache())
    
    // Calling a function
    clazz.fetchLicenseRecords("ScholasticLicenseCount", 200, 300, "lazy")
   
    
    // Calling a function with named parameter
    clazz.fetchLicenseRecords(fetchStrategy = "eager", pageStart = 200, tableName = "LearningZoneOrganizations", pageEnd = 300)
    
    // Method calling with default values
    clazz.retrieveEnvironmentProperties("araviuser")
    clazz.retrieveEnvironmentProperties("chinuser","QA")
    
    clazz.saveAUA("BANG_AUA", "CHENNAI_AUA", "COIM_AUA")
  }
}

class AScalaClass {
  
  // Function with empty parameters
  def fetchNoSQLStore() : String = "REDIS"
  
  // Function with empty parameters
  def fetchCache() : String = {
    return "voldemort"
  }
  
  /**
   * Method with default values
   * Required parameter should be first and default parameters come at last
   * 
   * If the default parameter is at the beginning, then explicit call by the named parameter is necessary
   * clazz.retrieveEnvironmentProperties(userName = "araviuser")
   */
  def retrieveEnvironmentProperties(userName: String, environment : String = "DEV") = {
    
    println("Environment - " + environment)
    println("UserName - " + userName)
    
  }
  
  /**
   * Function as a variable argument parameter
   */
  def saveAUA(asa : String*) : Unit = {
    for (i <- asa)
      println(i)
  }
  
  /**
   * Function as parameter groups
   */
  def saveZone(host:String)(id:Int)(socketPort:Int, adminPort:Int, httpPort:Int): Unit = {
    println(host + id + socketPort + adminPort + httpPort)
  }
  
  
  /**
   * A simple function
   */
  def fetchLicenseRecords(tableName : String, 
                          pageStart : Int,
                          pageEnd : Int,
                          fetchStrategy: String) : Boolean = {
   
    
    println("TableName - " + tableName)
    println("Fetch Strategy - " + fetchStrategy)
    println("Start - " + pageStart)
    println("End - " + pageEnd)
    
    return true
  }
  
 }
