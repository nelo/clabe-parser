[![CircleCI](https://circleci.com/gh/nelomobile/clabe-parser.svg?style=svg)](https://circleci.com/gh/nelomobile/clabe-parser)
[![codecov](https://codecov.io/gh/nelomobile/clabe-parser/branch/master/graph/badge.svg)](https://codecov.io/gh/nelomobile/clabe-parser)

# [Nelo](https://www.nelo.mx/) CLABE Parser

This library is a simple interface for parsing and validating [Clave Bancaria Estandarizada (CLABE)](https://en.wikipedia.org/wiki/CLABE) numbers. 

# Usage

### Parsing
```java
import co.nelo.clabe.parser.*;
...


Parser parser = new Parser();
ParsedClabe parsedClabe = parser.parse("002010077777777771");
System.out.println(parsedClabe.getInstitution().getShortName();  // Prints "BANAMEX"

Parser parser = new Parser();
ParsedClabe parsedClabe = parser.parse("00201007777777777");
System.out.println(parsedClabe.getInstitution().getShortName();  // Throws an error because the CLABE is too short
```

### Validation
The `isValid` method can be used to check whether a full CLABE is valid.
```java
import co.nelo.clabe.parser.*;
...


Parser parser = new Parser();
boolean isValid = parser.isValid("002010077777777771");
println(isValid)  // prints "true"

boolean isValid = parser.isValid("002010077777777772");
println(isValid)  // prints "false" due to check digit mismatch
```

### Partial Validation
The `isPartiallyValid` method can be used to check whether a partially entered CLABE is valid.
```java
import co.nelo.clabe.parser.*;
...

Parser parser = new Parser();
boolean isPartiallyValid = parser.isPartiallyValid("0020");
println(isPartially)  // prints "true"
```


# License
<sub>MIT License

Copyright (c) 2019 Nelo Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.</sub>
