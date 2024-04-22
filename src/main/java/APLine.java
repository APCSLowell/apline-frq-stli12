public class APLine
{
  private int a, b, c;
  public APLine (int one, int two, int c){
    a = one;
    b = two;
    c = three;
  }
  public double getSlope(){
    return (double)(-a)/(double)b;
  }
  public boolean isOnLine(int x, int y){
if((a * x) + (b * y) + c = 0)
  return true;
    else
  return false;
  }
}
