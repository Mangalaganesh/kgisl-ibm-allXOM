package main;

import java.util.LinkedList;

public class ListClass
{
  private LinkedList<InsuredDetails> list;
  
  public LinkedList<InsuredDetails> getList()
  {
    return list;
  }
  
  public void setList(LinkedList<InsuredDetails> list)
  {
    this.list = list;
  }
}