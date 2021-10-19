class  Rational{
privet int num=0;
privet int den=1;
}
rational(int n,int d)
{
num=n;
den=d;
}
public Rational add(Rational r)
Rational r1=new Rational();
r1.num=num*r.den+r.num*den;
r1.num=num*r.den;
return r1;
}
public Rational sub(Rational r)
{
Rational r1=new Rational();
r1.num=num*r.den-r.num*den;
r1.den=den*r.den;
return r1;
}
public Rational mul(Rational r)
{
Rational r1=new Rational();
r1.num=num*r.num;
r1.den=den*r.den;
return r1;
}
public Rational div(Rational r)
{
Rational r1=new Rational();
r1.num=num*r.den;
r1.den=den*r.num;
return r1;
}
int abc(int a, int b
{
if(b==0)
return a;
else return abc(b,a%b);
}
Rational reduce()
{
int t=abc(num,den);
num=num/t;
den=den/t;
return this;
}


