package com.java.fundation.packages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IDGenerator
{
  private static final long ONE_STEP = 10;
  private static final long BASE = 1129703383453l;
  private static final Lock LOCK = new ReentrantLock();
  private static long lastTime4long = System.currentTimeMillis();
  private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmssSSS");
  private static long lastTime =new Long(format.format(new Date()));
  private static short lastCount = 0;
  public  static Calendar nowCalendar   = Calendar.getInstance();
  private  final long time;
  private  final short count;

  
  	/**
	 * ���캯����ʼ����Ӧ�Ĳ���
	 * 
	 * @param lastTime4long
	 */
  public  IDGenerator(long lastTime4long) {
    LOCK.lock();
    try {
      if (lastCount == ONE_STEP) {
        boolean done = false;
        while (!done) {
          long now = System.currentTimeMillis();
          if (now == lastTime4long) {
            
            try {
              Thread.sleep(1);
            }
            catch (InterruptedException e) {
            }
            continue;
          }
          else {
        	lastTime4long = now;
            lastCount = 0;
            done = true;
          }
        }
      }
      time = lastTime4long;
      count = lastCount++;
    }
    finally {
      LOCK.unlock();
    }
   
  }
  public  IDGenerator() {
	    LOCK.lock();
	    try {
	      if (lastCount == ONE_STEP) {
	        boolean done = false;
	        while (!done) {
	        	long now = new Long(format.format(new Date()));
	          if (now == lastTime) {
	            
	            try {
	              Thread.sleep(1);
	            }
	            catch (InterruptedException e) {
	            }
	            continue;
	          }
	          else {
	            lastTime = now;
	            lastCount = 0;
	            done = true;
	          }
	        }
	      }
	      time = lastTime;
	      count = lastCount++;
	    }
	    finally {
	      LOCK.unlock();
	    }
	   
	  }
  
  /**
   * ���ɸ�ʽ��201010151010101000��long��ID
   * 
   * @return
   */
  public static long  generateID(){
	  IDGenerator idGenerator = new IDGenerator();
	  return (idGenerator.time)+idGenerator.count;
  }
  
  public static long generateLongID(){
	  IDGenerator idGenerator = new IDGenerator(lastTime4long);
      return (BASE+idGenerator.time)+idGenerator.count;
	 
  }
  
  /**
   * 
   *   ���ɸ�ʽ��2010-10151010101000���ַ�����ID
   * @return
   */
	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * ���ɸ�ʽ��UUID�ַ���
	 * 
	 * @return
	 */
	 public static String generateIDByDateStr(){
		return (generateID()+"").replace(nowCalendar.get(Calendar.YEAR)+"", nowCalendar.get(Calendar.YEAR)+"-");
		 
		 
	  }
  public static void main (String[]args){
//	 for(int i = 0;i<30;i++){
//	  System.out.println((int)IDGenerator.generateID());
//	  System.out.println(IDGenerator.generateID());
//	 }
//	 System.out.println("------------------------------------------------");
//	 for(int i = 0;i<30;i++){
//		  System.out.println((int)IDGenerator. generateLongID());
//		  System.out.println(IDGenerator. generateLongID());
//		 }
//	 
//	 System.out.println("------------------------------------------------");
//	 for(int i = 0;i<30;i++){
//		  System.out.println(IDGenerator.generateUUID());
//		 }
	  for(int i = 0;i<30;i++){
		  System.out.println(IDGenerator.generateIDByDateStr());
		 }
  }
}