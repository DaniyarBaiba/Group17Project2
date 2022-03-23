package Group17Project2;

abstract class Marks{
    public int mark1,mark2,mark3;
    Marks(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    abstract int getPercentage();
}
class A extends Marks{
    A(int mark1,int mark2,int mark3){super(mark1,mark2,mark3);}

    @Override
    public int getPercentage(){return (mark1+mark2+mark3)/3;}
}
class B extends Marks{
    B(int mark1,int mark2,int mark3){super(mark1,mark2,mark3);}

    @Override
    public int getPercentage(){return (mark1+mark2+mark3)/3;}
}