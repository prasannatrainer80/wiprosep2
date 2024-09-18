var employs = [
    {empno:1,name:"Kshama",basic:84823},
    {empno:2,name:"Muhammad",basic:90042},
    {empno:3,name:"Shyam",basic:91153},
    {empno:4,name:"Khushi",basic:90022},
    {empno:5,name:"Vipul",basic:98832},
    {empno:6,name:"Ajinkya",basic:90022},
    
]

function show() {
    for(var v in employs) {
        document.writeln("Employ No " +employs[v].empno + "Employ Name " +employs[v].name
             + " Basic  " +employs[v].basic + "<br/>");
    }
}