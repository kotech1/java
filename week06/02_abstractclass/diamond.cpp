// g++ diamond.cpp
#include <iostream>

class A {
public:
    int a;
    A(int a) {this->a = a;}
    void hello() { std::cout << a << "\n"; }
};

class B : public A {
public:
    B() : A(1) {}
};

class C : public A {
public:
    C() : A(2) {}
};

class D : public B, public C {
public:
    D() = default;
};

int main() {
    D d;

    // 경로 한정(qualified) 호출로 모호성 해소
    d.B::hello();  // 또는 d.B::A::hello();
    d.C::hello();  // 또는 d.C::A::hello();
    //d.hello(); // error

    return 0;
}
