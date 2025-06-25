/* memory.c */
#include <stdio.h>

int main(void) {
   int b[10], a[10];
   int i = 12;

   a[i] = 99; // no error
   printf("%d\n", b[0]); // b[0] = 99 in intel mac
   return 0;
}

