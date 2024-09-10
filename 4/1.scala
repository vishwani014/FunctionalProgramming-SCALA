val itemNames = Array("Mango", "Orange","Apple","Banana");
val itemCount = Array(100, 80, 150, 200);

def displayInventory(itemNames : Array[String], itemCount : Array[Int]) : Unit = { //prints inventory
    if(itemNames.nonEmpty){
        println(itemNames.head + " " + itemCount.head);
        displayInventory(itemNames.tail, itemCount.tail)
    }
}

def restockItem(item_name : String, quantity : Int) : Unit = item_name match{ //restock items
    case "Mango" => itemCount(0) = itemCount(0) + quantity;
    case "Orange" => itemCount(1) = itemCount(1) + quantity;
    case "Apple" => itemCount(2) = itemCount(2) + quantity;
    case "Banana" => itemCount(3) = itemCount(3) + quantity;
    case _ => println("Invalid Item");
}

def sellItem(item_name : String, quantity : Int) : Unit = {
    if(itemNames.indexOf(item_name) == -1){
        println("Invalid Item");
    }
    else if(itemCount(itemNames.indexOf(item_name)) < quantity){
        println("Out of stock");
    }
    else{
        itemCount(itemNames.indexOf(item_name)) = itemCount(itemNames.indexOf(item_name)) - quantity;
    }
}

@main def main() = {
    displayInventory(itemNames, itemCount);
    restockItem("Orange", 100);
    displayInventory(itemNames, itemCount);
    sellItem("Banana", 250);
    sellItem("Mango", 25);
    displayInventory(itemNames, itemCount);
}



