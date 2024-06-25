class SortAsc
{
  public static void main(String args[])
  {
    int array[]={4,3,7,1,9};
    int n=array.length;
    int i,j;
    int temp=0;
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(array[i]>array[j])
        {
          temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    System.out.println("Sorted elements of an array ");
    for(i=0;i<n;i++)
    {
      System.out.println(array[i]);
    }
  }
}