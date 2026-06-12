// remove odd nodes rom linked list

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};
struct Node* head = NULL;

void removeOddNodes() {
    struct Node* c = head;
    struct Node* p = NULL;

    while (c != NULL) {
        if (c->data % 2 != 0) {
            if (p == NULL) {
                head = c->next;
            } else {
                p->next = c->next;
            }
            struct Node* temp = c;
            c = c->next;
            free(temp);
        } else {
            p = c;
            c = c->next;
        }
    }
}
void insert(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = head;
    head = newNode;
}
void display() {
    struct Node* current = head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
} 
int main() {
    insert(1);
    insert(2);
    insert(3);
    insert(4);
    insert(5);

    printf("Original list:\n");
    display();

    removeOddNodes();

    printf("List after removing odd nodes:\n");
    display();

    return 0;
}