# Reactive Exchange

Explore RxAndroid and Reactive Programming Paradigms in Android

## External APIs

- [Coinbase Exchange](https://docs.exchange.coinbase.com/): Bitcoin Exchange when you can buy and sell Bitcoin.

## Libraries

- [RxAndroid](https://github.com/ReactiveX/RxJava): ReactiveX for the JVM
- [RxJava](https://github.com/ReactiveX/RxAndroid): ReactiveX Binding for Android
- [AndroidAsync](https://github.com/koush/AndroidAsync): Asynchronous Socket Library for Android

## Data Flow
Reactive Exchange follows a unidirectional data flow where events enter a the application via an `Observable`. The `Observable` then allows us to react to events in the system accordingly by propagating through a set of filtering, transformation, and reduction functions. The resulting events are then passed on to subscribers that effect a change in the application.

![Data Flow](https://raw.githubusercontent.com/blad/reactive-exchange/master/assets/ReactiveExchangeDataFlow.png)
## License: The MIT License (MIT)

```
Copyright (c) 2016 Bladymir Tellez

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
SOFTWARE.
```
