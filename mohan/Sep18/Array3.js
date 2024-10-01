function show() {
    var array = new Array("Wipro", true, function() {return 5;},
        {empno:1,name:"Prasanna",salary:88424.22} );
   
        document.writeln("Name  " +array[0] + "<br/>");
        document.writeln("Boolean " +array[1] + "<br/>");
        document.writeln("Function Value  " + array[2]() + "<br/>");
        document.writeln("Employ No  " +array[3].empno + "<br/>");
        document.writeln("Employ Name  " +array[3].name + "<br/>");
        document.writeln("Salary is  " +array[3].salary +"<br/>");
  
}