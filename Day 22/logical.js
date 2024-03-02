var a = true;
var b = false;
var linebreak = "<br />";

document.write("(a && b) => ");
result = (a && b);
document.write(result);
document.write(linebreak);
document.write("(a || b) => ");
result = (a || b);
document.write(result);
document.write(linebreak);
document.write("!(a && b) => ");
result = (!(a && b));
document.write(result);
document.write(linebreak);   
var a = 10; // Bit presentation 10
            var b = 0b1010; // binary number
            var c = 030;// Octal 
	     var d = 0xfff;// hexa 
            var linebreak = "<br />";         
            document.write(a);
            document.write(linebreak);
            document.write(b);
            document.write(linebreak);
            document.write(c);
            document.write(linebreak);
            ocument.write(d);
document.write(linebreak);
document.write(b>>2);            document.write(linebreak);           document.write(b<<2);            document.write(linebreak);
document.write(~b);
document.write(linebreak);


