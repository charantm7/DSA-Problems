class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert_begining(self, val: int) -> None:
        new_node = Node(val)
        new_node.next = self.head
        self.head = new_node

    def insert_atEnd(self, val: int) -> None:

        new_node = Node(val)

        if self.head == None:
            self.head = new_node
            return

        current = self.head

        while current.next:
            current = current.next

        # storing the new node reference to the current.next [data|next]
        current.next = new_node

    def insert_after(self, target: int, val: int) -> None:

        current = self.head

        while current:

            if current.data == target:
                new_node = Node(val)
                new_node.next = current.next
                current.next = new_node
                return
            current = current.next

    def display(self):
        current = self.head

        while current:
            print(current.data, end=' -> ')
            current = current.next

        print("None")


if __name__ == '__main__':
    sl = SinglyLinkedList()
    sl.insert_begining(40)
    sl.insert_begining(30)
    sl.insert_begining(20)
    sl.insert_begining(10)

    sl.insert_atEnd(50)

    sl.insert_after(20, 25)

    sl.display()
