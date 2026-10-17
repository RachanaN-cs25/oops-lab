class book{
int bookid;
string title;
string author;
double price;
static int totalbooks=0;
}
book(int bookid,string title,string author,double price){
this.bookid=bookid;
this.title=title;
this.author=author;
this.price=price;
totalbooks++
}
void display(){
system.out.println("book ID:"+bookid);
system.out.println("title:"+title):
system.out.println("author:"+author);
syste,.out.println("price:"+price);
}
Boolean search(int id){
return this.bookid==id;
}
Boolean search(string title){
return this.title.equalsignorecase(title);
}
book costlierbook(book other){
if(this.price>=other.price)
return this;
else
return other;
}
static int gettotalbooks(){
return totalbooks;
}
}
public class main(){
public static void main(string[] args){
book B1=new book(101,"java programming","james gosling",550.00);
book B2=new book(102,"python basics","GUIDO VAN ROSSUM",450.00);
book B3=new book(103,"data structures","mark allen",650.00);
system.out.println("BOOK DETAILS");
B1.display();
B2.display();
B3.display();
System.out.println("Searching by Book ID 102");
if (b2.search(102))
System.out.println("Book found: Python Basics");
else
System.out.println("Book not found");
System.out.println("\nSearching by Title'Data Structures':");
if (b3.search("Data Structures"))
System.out.println("Book found: Data Structures");
else
System.out.println("Book not found");

Book costlier = b1.costlierBook(b3);

System.out.println(&quot;\nCostlier Book:&quot;);
costlier.display();

System.out.println("Total Books Created:"
+ Book.getTotalBooks());
}
}

