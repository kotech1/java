#include <iostream>
class A {
public:
    void hello() { std::cout << "A\n"; }
};

class B : public A {};
class C : public A {};
class D : public B, public C {};

int main() {
    D d;

    // 1) 경로 한정(qualified) 호출
    d.B::hello();        // 또는 d.B::A::hello();
    d.C::hello();        // 또는 d.C::A::hello();

    // 2) 캐스팅으로 경로를 고정
    static_cast<B&>(d).hello();
    static_cast<C&>(d).hello();

    return 0;
}
