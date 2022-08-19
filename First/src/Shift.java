public class Scope {

public static void main(String[] args) {
// TODO Auto-generated method stub
int outer = 1;
{
int inner = 2;
System.out.println(&quot;inner = &quot; + inner);
System.out.println(&quot;outer = &quot; + outer);
}
int inner = 3;
System.out.println(&quot;inner = &quot; + inner);
System.out.println(&quot;outer = &quot; + outer);
}
}
______________________________________________________________________
public class RelationalLogicalOperators {

public static void main(String[] args) {
Random rand = new Random();
int i = rand.nextInt(100);
int j = rand.nextInt(100);
System.out.println(&quot;i = &quot; + i);
System.out.println(&quot;j = &quot; + j);
System.out.println(&quot;i &gt; j is &quot; + (i &gt; j));
System.out.println(&quot;i &lt; j is &quot; + (i &lt; j));
System.out.println(&quot;i &gt;= j is &quot; + (i &gt;= j));
System.out.println(&quot;i &lt;= j is &quot; + (i &lt;= j));
System.out.println(&quot;i == j is &quot; + (i == j));
System.out.println(&quot;i != j is &quot; + (i != j));
System.out.println(&quot;(i &lt; 10) &amp;&amp; (j &lt; 10) is &quot; + ((i &lt; 10) &amp;&amp;
(j &lt; 10)));
System.out.println(&quot;(i &lt; 10) || (j &lt; 10) is &quot; + ((i &lt; 10) ||
(j &lt; 10)));
}
}

public class TernaryOperator {

public static void main(String[] args) {
int v = 1;
System.out.println(v == 1 ? &quot;A&quot; : &quot;B&quot;);
v++;
System.out.println(v == 1 ? &quot;A&quot; : &quot;B&quot;);
}

}
public class PrefixPostfix {

public static void main(String[] args) {
// TODO Auto-generated method stub
int numA = 5;
int numB = 10;
int numC = 0;
numC = --numC + numB--;
System.out.println(numA);
System.out.println(numC);
System.out.println(numB);
}
}
public class RightShift {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int i;
int num = 16;
for(i=0; i&lt;4; i++) {
num = num &gt;&gt; 1; //16&gt;&gt;1--&gt; 00010000 ---&gt; 00001000
System.out.println(num);
}
}
}

public class AssignmentOperator {
/**
* @param args
*/
public static void main(String args[]) {
int a = 1;
int b = 2;
int c = 3;
a += 5; //a=a+5---&gt;6
b *= 4; //b=b*4---&gt;8
c += a * b; //c=c+(a*b)--&gt;51
c %= 6; //--&gt;3
System.out.println(&quot;a = &quot; + a);
System.out.println(&quot;b = &quot; + b);
System.out.println(&quot;c = &quot; + c);
}

}
public class IfExample {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int a = 2;
if (a == 1) {
System.out.println(&quot;one&quot;);
} else if (a == 2) {
System.out.println(&quot;two&quot;);
} else if (a == 3) {
System.out.println(&quot;three&quot;);
} else {
System.out.println(&quot;invalid&quot;);
}
}
}
public class ContinueExample {

public static void main(String[] args) {
int lim = 10;
int sum = 0;
for (int i = 1; i &lt;= lim; i++) {
if (i % 4 == 0) {
continue;
}
sum += i;
}
System.out.println(sum);
}
}
public class SwitchExample {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int i = 0;
switch (i) {
case 0:
System.out.println(&quot;i is 0&quot;);
case 1:
System.out.println(&quot;i is 1&quot;);
case 2:
System.out.println(&quot;i is 2&quot;);
}
}
}

public class SwitchInString {
public static void main(String[] args) {
String currentDay = args[0];
switch (currentDay) {
case &quot;MONDAY&quot;:
case &quot;TUESDAY&quot;:

case &quot;WEDNESDAY&quot;:
System.out.println(&quot;boring&quot;);
break;
case &quot;THURSDAY&quot;:
System.out.println(&quot;getting better&quot;);
break;
case &quot;FRIDAY&quot;:
case &quot;SATURDAY&quot;:
case &quot;SUNDAY&quot;:
System.out.println(&quot;much better&quot;);
break;
}
}
}
public class LabelledBreak {
public static void main(String[] args) {
int len = 3;
int key = 1;
int k = 0;
out: {
for (int i = 0; i &lt; len; i++) {
in:{
for (int j = 0; j &lt; len; j++) {
if (i == key) {
break out;
}
k += 1;
}
}
}
}
System.out.println(k);
}
}
______________________________________________________________________

public class WhileEg {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int i=0;
while(i&lt;10)
{
System.out.println(i + &quot; &quot;);
i++;
}
}
}
public class DoWhileExample {
public static void main(String[] args) {
int i=0;
do
{
System.out.println(i + &quot; &quot;);
i++;
}while(i&lt;10);
}
}